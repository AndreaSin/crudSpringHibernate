package com.example.note;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

//Data è projectLombok che crea getter e setter per conto suo, potrebbe anche creare i costruttori con altre annotazioni
//ricordare cmq di installare Lombok sul pc eseguendo il Jar nella .m2
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
