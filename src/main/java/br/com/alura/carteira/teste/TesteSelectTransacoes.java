package br.com.alura.carteira.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.carteira.dao.TransacaoDao;
import br.com.alura.carteira.modelo.Transacao;

public class TesteSelectTransacoes {

	public static void main(String[] args) {
		try {
		String url = "jdbc:mysql://localhost:3306/carteira";
		String usuario = "root";
		String senha = "root";
		Connection conexao;
	
		conexao = DriverManager.getConnection(url, usuario, senha);
		TransacaoDao dao = new TransacaoDao(conexao);
		List<Transacao> transacoes = dao.listar();
			
		//transacoes.forEach(System.out::println); Java8 lambda/method reference
			
		for(Transacao transacao : transacoes) {
			System.out.println(transacao);
			}
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro!");
		}
		
		
	}
}
