package com.julieht.challenge_foroHub_one;

import com.alura.forum.domain.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
	boolean existsByTitleAndMessage(String title, String message);
}