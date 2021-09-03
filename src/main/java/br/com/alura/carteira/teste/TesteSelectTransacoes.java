package br.com.alura.carteira.teste;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.time.LocalDate;

import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;

public class TesteSelectTransacoes {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/carteira";
		String usuario = "root";
		String senha = "root";
		
		try {
			Connection conexao = DriverManager.getConnection(url,usuario,senha);			
			
			String sql = "select * from transacoes";
	
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Transacao t = new Transacao();
				t.setTicker(rs.getString("ticker"));
				t.setData(rs.getDate("data").toLocalDate());
				t.setPreco(rs.getBigDecimal("preco"));
				t.setQuantidade(rs.getInt("quantidade"));
				t.setTipo(TipoTransacao.valueOf(rs.getString("tipo")));
				System.out.println(t);
				System.out.println("================================");
				
			}
		
		} catch (SQLException e) {
			
			System.out.println("Erro na conexão");
		}
		
	}
}
