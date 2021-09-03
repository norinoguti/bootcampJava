package br.com.alura.carteira.teste;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.time.LocalDate;

import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;

public class TesteInsertTransacoes {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/carteira";
		String usuario = "root";
		String senha = "root";
		
		try {
			Connection conexao = DriverManager.getConnection(url,usuario,senha);
			
			Transacao t = new Transacao(
					"MGLU3",
					LocalDate.of(2021,05,05),
					new BigDecimal(51.50),
					200,
					TipoTransacao.VENDA);
			
			String sql = "insert into transacoes(ticker,data,preco,quantidade,tipo)"
						+ "values (?, ?, ?, ?, ?)";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, t.getTicker());
			ps.setDate(2, Date.valueOf(t.getData()));
			ps.setBigDecimal(3,t.getPreco());
			ps.setInt(4, 200);
			ps.setString(5, t.getTipo().toString());
			
			ps.execute();
			
		} catch (SQLException e) {
			
			System.out.println("Erro na conexão");
		}
		
	}
}
