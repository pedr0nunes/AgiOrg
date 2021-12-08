package com.example.demo.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fabio
 *classe para representar os usuarios, com id, senha, primeiroNome, e sobrenome
 *também possuira relacionamento com............
 */
@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique =true, length = 45)
	private String email;
	
	@Column(nullable = false, length = 64)
	private String password;
	
	@Column(nullable = false, length = 20)
	private String primeiroNome;
	
	@Column(nullable = false, length = 20)
	private String sobrenome;
	
	@Column(nullable=false)
	private LocalDate dataCadastro;
	
	
	
	//getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	//relacionamentos
	//transacoes do usuario - 1 usuario -> n transacoes
	 @OneToMany(mappedBy = "usuario")
	 private List<Transacoes> transacoes = new ArrayList<>();
	 
	 //extratos do usuario - 1 usuario -> n extratos
	 @OneToMany(mappedBy = "usuario")
	 private List<Extrato> extratos = new ArrayList<>();
	 
	 //contas pendentes do usuario -> 1 usuario -> n contas pendentes
	 @OneToMany(mappedBy = "usuario")
	 private List<ContasAPagar> contas = new ArrayList<>();
	
}
