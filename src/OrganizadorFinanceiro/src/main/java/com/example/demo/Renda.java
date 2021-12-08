package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Renda")
public class Renda {
	//incompleto
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Renda;
	@Column
	private int tipoDeRenda;
	@Column
    private int valor;
	@Column
    private int rendaUsuario;
	public int getTipoDeRenda() {
		return tipoDeRenda;
	}
	public void setTipoDeRenda(int tipoDeRenda) {
		this.tipoDeRenda = tipoDeRenda;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getRendaUsuario() {
		return rendaUsuario;
	}
	public void setRendaUsuario(int rendaUsuario) {
		this.rendaUsuario = rendaUsuario;
	}
    
//    public Renda(int id_Renda, int valor){
//        this.id_Renda = id_Renda;
//        this.valor = valor;
//    }
    
   
}