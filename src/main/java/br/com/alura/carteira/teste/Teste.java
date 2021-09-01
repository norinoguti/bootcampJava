package br.com.alura.carteira.teste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;

public class Teste {

	public static void main(String[] args) {	
		

		Transacao t = new Transacao();
		t.setTicker("ITSA4");
		t.setPreco(new BigDecimal("10.0"));
		t.setQuantidade(100);
		t.setData(LocalDate.now());
		t.setTipo(TipoTransacao.COMPRA);

		System.out.println(t.getTicker());
		System.out.println(t.getPreco());
		System.out.println(t.getQuantidade());
		System.out.println(t.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(t.getTipo());
		
		
		Transacao t2 = new Transacao("XPTO12", new BigDecimal("12.7"), LocalDate.now(), 200, TipoTransacao.VENDA);

		System.out.println(t2);
	}

}
