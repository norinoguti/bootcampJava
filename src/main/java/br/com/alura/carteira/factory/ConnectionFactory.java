package br.com.alura.carteira.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/carteira";
			String usuario = "root";
			String senha = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection 	conexao = DriverManager.getConnection(url, usuario, senha);
			return conexao;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
	}
}
