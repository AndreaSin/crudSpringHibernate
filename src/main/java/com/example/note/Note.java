package com.example.note;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

// Data è un'annotazione di projectLombok che crea getter e setter per conto suo, potrebbe anche creare i costruttori con altre annotazioni
// Ricordare di installare Lombok sul pc eseguendo il Jar nella cartella .m2 la prima volta
@Data
@Entity
public class Note {
	private @Id @GeneratedValue Long id;
	private String title;
	private String content;
	
	public Note() {}

	public Note(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	
	
	
}
