package br.com.alura.carteira.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Transacao {

	private String ticker;	
	private LocalDate data;
	private BigDecimal preco;
	private int quantidade;
	private TipoTransacao tipo;	
	

	

	@Override
	public String toString() {
		return "Transacao [ticker=" + ticker + ", data=" + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ", preco=" + preco + ", quantidade=" + quantidade
				+ ", tipo=" + tipo.name() + "]";
	}

	public Transacao() {};

	public Transacao(String ticker, LocalDate data, BigDecimal preco, int quantidade, TipoTransacao tipo) {
		
		this.ticker = ticker;
		this.data = data;
		this.preco = preco;
		this.quantidade = quantidade;
		this.tipo = tipo;
	}


	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public TipoTransacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransacao tipo) {
		this.tipo = tipo;
	}

}
