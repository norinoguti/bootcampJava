package br.com.alura.carteira.modelo;

public enum TipoTransacao {
	COMPRA("Compra"),
	VENDA("Venda");

	private String descricao;
	
	TipoTransacao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricaoTipo() {
		return descricao;
	}
		
}
	
