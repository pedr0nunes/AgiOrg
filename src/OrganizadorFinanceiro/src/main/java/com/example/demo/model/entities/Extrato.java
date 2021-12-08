package com.example.demo.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.model.transactionCategories.TipoDeTransacao;

/**
 * 
 * @author fabio
 *classe para o saldo total
 *
 */
@Entity
@Table(name="extrato")
public class Extrato {
	//atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private Double quantia;
	
	
	
	//relacionamentos
	@OneToMany(mappedBy="extrato")
	private List<Transacoes> transacoes = new ArrayList<>();
	
	
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
	
    
    //funcoes 
    public void operacoesQuantias(Double quantia, TipoDeTransacao tipoTransacao) {
        if(tipoTransacao == TipoDeTransacao.ENTRADAS){
            this.quantia += quantia;
        }
        
        if(tipoTransacao == TipoDeTransacao.SAIDA){
            this.quantia -= quantia;
        }
    }


	
}
