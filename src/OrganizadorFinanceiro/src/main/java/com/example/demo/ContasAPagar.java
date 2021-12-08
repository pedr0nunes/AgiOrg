package com.example.demo;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "contasAPagar")
public class ContasAPagar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Contas;
	@Column(nullable = false, length = 64)
    private String tipoConta;
	@Column(nullable = false)

	
    private BigDecimal valorDaConta;
	@Column(nullable = false)
	private boolean pago;
	@Column(nullable = false)
	private int usuarioDevedor;
	
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public BigDecimal getValorDaConta() {
		return valorDaConta;
	}
	public void setValorDaConta(BigDecimal valorDaConta) {
		this.valorDaConta = valorDaConta;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public int getUsuarioDevedor() {
		return usuarioDevedor;
	}
	public void setUsuarioDevedor(int usuarioDevedor) {
		this.usuarioDevedor = usuarioDevedor;
	}
    
//    public ContasAPagar(int id_Contas, String tipoConta,BigDecimal quantiaContas){
//        this.id_Contas = id_Contas;
//        this.tipoConta = tipoConta;
//        this.valorDaConta = quantiaContas;
//    }
    
    
}
