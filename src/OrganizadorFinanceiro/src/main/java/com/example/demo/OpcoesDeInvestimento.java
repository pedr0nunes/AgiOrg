package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "opcoesDeInvestimento")
public class OpcoesDeInvestimento {
	@Column
    private int id_Opcao;
	@Column
    private String tipo;
	@Column
    private ArrayList investidoresId;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public ArrayList getInvestidoresId() {
		return investidoresId;
	}
	public void setInvestidoresId(ArrayList investidoresId) {
		this.investidoresId = investidoresId;
	}
    
   
}