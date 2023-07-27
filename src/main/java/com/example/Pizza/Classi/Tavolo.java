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
public class Tavolo {
	
	@Id
	@GeneratedValue
	private UUID id;
	private int numeroTavolo;
	private int numeroPosti;
	
	public Tavolo (int _numeroTavolo, int _numeroPosti) {
		
		this.numeroTavolo = _numeroTavolo;
		this.numeroPosti = _numeroPosti;
	}

}
