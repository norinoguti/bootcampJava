package br.com.alura.carteira.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {

	private String ticker;
	private BigDecimal preco;
	private LocalDate data;
	private int quantidade;
	private TipoTransacao tipo;

	@Override
	public String toString() {
		return "Transacao [ticker=" + ticker + ", preco=" + preco + ", data=" + data + ", quantidade=" + quantidade
				+ ", tipo=" + tipo + "]";
	}

	public Transacao() {
	}

	public Transacao(String ticker, BigDecimal preco, LocalDate data, int quantidade, TipoTransacao tipo) {
		super();
		this.ticker = ticker;
		this.preco = preco;
		this.data = data;
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

	public void setTipo(TipoTransacao string) {
		this.tipo = string;
	}

}
