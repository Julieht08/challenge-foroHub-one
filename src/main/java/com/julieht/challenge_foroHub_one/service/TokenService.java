package com.julieht.challenge_foroHub_one;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.alura.forum.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {
	@Value("${api.security.token.secret}")
	private String secret;

	public String generateToken(User user) {
		try {
			Algorithm algorithm = Algorithm.HMAC256(secret);
			return JWT.create()
					.withIssuer("Forum API")
					.withSubject(user.getUsername())
					.withExpiresAt(expirationDate())
					.sign(algorithm);
		} catch (JWTCreationException exception) {
			throw new RuntimeException("Error generating token", exception);
		}
	}

	private Instant expirationDate() {
		return LocalDateTime.now()
				.plusHours(2)
				.toInstant(ZoneOffset.of("-03:00"));
	}
}