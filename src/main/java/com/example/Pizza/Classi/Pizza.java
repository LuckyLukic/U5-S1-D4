package com.example.Pizza.Classi;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pizza {
	
	@Id
	@GeneratedValue
	private UUID id;
	private String nome;
	private double prezzo;
	private int calorie;
	
	@OneToOne(mappedBy = "pizza")
	private User user;
	
	public Pizza (String _nome, double _prezzo, int _calorie, User _user) {
		
		this.nome = _nome;
		this.prezzo = _prezzo;
		this.calorie = _calorie;
		this.user = _user;
		
	}
	

}
