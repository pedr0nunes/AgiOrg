package com.example.demo;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "fluxoDeCaixa")
public class FluxoDeCaixa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Fluxo;
	@Column
	private int quantMonetaria;
	@Column
    private LocalDateTime data;
    
	@Column
    private int fluxoUsuario;
    public int getQuantMonetaria() {
		return quantMonetaria;
	}

	public void setQuantMonetaria(int quantMonetaria) {
		this.quantMonetaria = quantMonetaria;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public int getFluxoUsuario() {
		return fluxoUsuario;
	}

	public void setFluxoUsuario(int fluxoUsuario) {
		this.fluxoUsuario = fluxoUsuario;
	}

	
    
    
}