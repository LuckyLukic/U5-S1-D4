package com.example.Pizza.Classi;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
	
	@OneToOne
	private Pizza pizza;
	
	@ManyToOne
	private Tavolo tavolo;
	
	public User (String _nome, String _cognome, Pizza _pizza, Tavolo _tavolo) {
		
		this.nome =  _nome;
		this.cognome = _cognome;
		this.tavolo = _tavolo;
		
	}

	@Override
	public String toString() {
		return "User [ nome=" + nome + ", cognome=" + cognome + ", tavolo=" + tavolo
				+ "]";
	}
	
	
	
	
}
