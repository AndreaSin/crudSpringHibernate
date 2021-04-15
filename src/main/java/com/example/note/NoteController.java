package com.example.note;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
	
	private final NoteRepository noteRepository;

	public NoteController(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}
	
	@GetMapping("/notes")
	Iterable<Note> getNotes() {
		return noteRepository.findAll();
	}
	
	@GetMapping("/notes/{id}")
	Note getNote(@PathVariable Long id) {
		return noteRepository.findById(id).orElseThrow();
	}
	
	@PostMapping("/notes")
	Note createNote(@RequestBody Note newNote) {
		return noteRepository.save(newNote);
	}
	
	@PutMapping("/notes/{id}")
	Note updateNote(@PathVariable Long id, @RequestBody Note noteDto) {
		Note noteToUpdate = noteRepository.findById(id).orElseThrow();
		noteToUpdate.setTitle(noteDto.getTitle());
		noteToUpdate.setContent(noteDto.getContent());
		return noteRepository.save(noteToUpdate);
	}
}