package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "saldoTotal")
public class SaldoTotal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Saldo;
	@Column
    private int quantidadeMonetaria;
	@Column
    private int usuarioSaldo;
	public int getQuantidadeMonetaria() {
		return quantidadeMonetaria;
	}
	public void setQuantidadeMonetaria(int quantidadeMonetaria) {
		this.quantidadeMonetaria = quantidadeMonetaria;
	}
	public int getUsuarioSaldo() {
		return usuarioSaldo;
	}
	public void setUsuarioSaldo(int usuarioSaldo) {
		this.usuarioSaldo = usuarioSaldo;
	}
    
    
}
