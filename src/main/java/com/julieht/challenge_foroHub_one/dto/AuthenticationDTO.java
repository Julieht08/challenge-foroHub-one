package com.julieht.challenge_foroHub_one;

import jakarta.validation.constraints.NotBlank;

public record AuthenticationDTO(
		@NotBlank String username,
		@NotBlank String password
) {}