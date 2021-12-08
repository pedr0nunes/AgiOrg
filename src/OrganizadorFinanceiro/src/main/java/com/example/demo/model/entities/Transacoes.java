package com.example.demo.model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.model.transactionCategories.TipoDeTransacao;

/**
 * @author fabio
 *classe para representar transacoes, tanto de saida, quanto de entrada.
 *Portanto, estas entradas/saidas irao entrar no saldoTotal
 */

@Entity
@Table(name="transacoes")
public class Transacoes {
	//atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private Double quantia;
	
	@Column(nullable=false)
	private String descricao;
	
	@Column(nullable=false)
	private LocalDate data;
	
	//relacionamentos
    @ManyToOne
    @JoinColumn(name = "catgoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "extrato_id")
    private Extrato extrato;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
	
	

}