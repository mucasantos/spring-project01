package com.mucasantos.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mucasantos.cursomc.domain.enums.StatusPagamento;

@Entity
public class PagamentoComBoleto  extends Pagamento{
		private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataVencimento;
	
	private Date dataPagamento;

	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer id, StatusPagamento statusPagamento, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, statusPagamento, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
	
}
