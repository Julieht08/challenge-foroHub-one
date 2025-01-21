package com.julieht.challenge_foroHub_one;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "topics")
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private String message;
	private LocalDateTime creationDate;

	@Enumerated(EnumType.STRING)
	private TopicStatus status;

	@ManyToOne
	private User author;

	@ManyToOne
	private Course course;
}