package com.julieht.challenge_foroHub_one;

import com.alura.forum.domain.Topic;
import com.alura.forum.dto.TopicDTO;
import com.alura.forum.repository.TopicRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {
	@Autowired
	private TopicRepository repository;

	@PostMapping
	public ResponseEntity<Topic> create(@RequestBody @Valid TopicDTO data) {
		// Implementación
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<Topic>> list() {
		var topics = repository.findAll();
		return ResponseEntity.ok(topics);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Topic> detail(@PathVariable Long id) {
		var topic = repository.findById(id);
		return topic.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("/{id}")
	public ResponseEntity<Topic> update(@PathVariable Long id, @RequestBody @Valid TopicDTO data) {
		// Implementación
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		if (!repository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
