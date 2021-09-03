package br.com.alura.carteira.teste;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.alura.carteira.dao.TransacaoDao;
import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;

public class TesteInsertTransacoes {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/carteira";
			String usuario = "root";
			String senha = "root";
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			TransacaoDao dao = new TransacaoDao(conexao);
			Transacao transacao = new Transacao("MGLU5", LocalDate.of(2021,06,06), new BigDecimal("44.50"), 300,
			TipoTransacao.COMPRA);

			dao.cadastrar(transacao);
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro!");
		}
		
	}
}
