CREATE TABLE users (
    id BIGINT NOT NULL AUTO_INCREMENT,
    username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(300) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    PRIMARY KEY(id)
);

CREATE TABLE courses (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE topics (
    id BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(300) NOT NULL,
    message TEXT NOT NULL,
    creation_date DATETIME NOT NULL,
    status VARCHAR(20) NOT NULL,
    author_id BIGINT NOT NULL,
    course_id BIGINT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(author_id) REFERENCES users(id),
    FOREIGN KEY(course_id) REFERENCES courses(id)
);

