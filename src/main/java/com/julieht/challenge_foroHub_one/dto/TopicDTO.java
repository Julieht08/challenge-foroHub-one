package com.julieht.challenge_foroHub_one;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicDTO(
		@NotBlank String title,
		@NotBlank String message,
		@NotNull Long authorId,
		@NotNull Long courseId
) {}