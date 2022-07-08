package com.mucasantos.cursomc.domain;

import javax.persistence.Entity;

import com.mucasantos.cursomc.domain.enums.StatusPagamento;

@Entity
public class PagamentoComCartao extends Pagamento{
	
		private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {}

	public PagamentoComCartao(Integer id, StatusPagamento statusPagamento, Pedido pedido, Integer numeroDeParcelas) {
		super(id, statusPagamento, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	

}
