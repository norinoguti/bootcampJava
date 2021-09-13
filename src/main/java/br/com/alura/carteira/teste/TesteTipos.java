package br.com.alura.carteira.teste;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;

public class TesteTipos {

	public static void main(String[] args) {
		for (TipoTransacao tipos : TipoTransacao.values()) {
			System.out.println(tipos.getDescricaoTipo());
		}	
	 }
	}		
				


