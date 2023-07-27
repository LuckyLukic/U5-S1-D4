package com.example.Pizza.Classi;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class User {

	@Id
	@GeneratedValue
	private UUID id;
	private String nome;
	private String cognome;
	
	public User (String _nome, String _cognome ) {
		
		this.nome =  _nome;
		this.cognome = _cognome;
		
	}
	
	
}
