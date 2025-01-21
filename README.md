# challenge-foroHub-one - Alura Challenge Backend con Spring Framework

Desarrollo del challenge ForoHub para el curso **ONE (Oracle Next Education) y Alura Latam**.
Una API REST desarrollada con Spring Boot para gestionar un foro de discusión, permitiendo la creación, lectura, 
actualización y eliminación de tópicos, con autenticación de usuarios mediante JWT.

## 🚀 Características:

- CRUD completo de tópicos.
- Autenticación y autorización con JWT.
- Validaciones de negocio.
- Base de datos MySQL.
- Migraciones con Flyway.

## 📋 Requisitos Previos:

- Java 17 o superior.
- Maven 3.6.3 o superior.
- MySQL 8.0 o superior.

## 🔧 Instalación:

1. Clona el repositorio:

```bash
git clone https://github.com/Julieht08/challenge-foroHub-one.git
```

2. Configura la base de datos MySQL:

```sql
CREATE DATABASE forohub;
```

3. Actualiza el archivo `application.properties` con tus credenciales:

```properties
spring.datasource.url=jdbc:mysql://${DB_HOST}/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
```
${DB_HOST}: nombre del equipo.
${DB_NAME}: nombre de la base de datos.
${DB_USER}: nombre del usuario en mysql.
${DB_PASSWORD}: contraseña en mysql.

4. Ejecuta el proyecto:

## 📌 Endpoints:

### Tópicos

| Método | URL           | Descripción            |
|--------|---------------|------------------------|
| POST   | /topics       | Crear un nuevo tópico  |
| GET    | /topics       | Listar todos los tópicos |
| GET    | /topics/{id}  | Obtener un tópico específico |
| PUT    | /topics/{id}  | Actualizar un tópico   |
| DELETE | /topics/{id}  | Eliminar un tópico     |

### Autenticación

| Método | URL    | Descripción          |
|--------|--------|----------------------|
| POST   | /login | Autenticar usuario   |

## 🔒 Seguridad:

La API utiliza JWT (JSON Web Tokens) para la autenticación. Para acceder a los endpoints protegidos:

1. Obtén un token mediante el endpoint `/login`
2. Incluye el token en el header de las siguientes peticiones:

```http
Authorization: Bearer [tu_token]
```

## 🛠️ Tecnologías Utilizadas:

- Spring Boot.
- Spring Security.
- Spring Data JPA.
- MySQL.
- Flyway.
- JWT.
- Lombok.

## ✅ Reglas de Negocio:

- Todos los campos son obligatorios.
- No se permiten tópicos duplicados (mismo título y mensaje).
- Solo usuarios autenticados pueden interactuar con la API.
- El token JWT tiene una validez de 2 horas.

## 🔍 Ejemplos de Uso:

### Crear un Tópico:

```http
POST /topics
Authorization: Bearer [token]
Content-Type: application/json

{
    "title": "Problema con Spring Security",
    "message": "No puedo configurar la autenticación JWT",
    "authorId": 1,
    "courseId": 1
}
```

### Autenticación:

```http
POST /login
Content-Type: application/json

{
    "username": "usuario",
    "password": "contraseña"
}
```

## ✨ Créditos

Desarrollado como parte del Challenge Backend de Alura Latam.

