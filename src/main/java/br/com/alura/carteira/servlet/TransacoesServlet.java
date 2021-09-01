package br.com.alura.carteira.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;


@WebServlet("/transacoes")
public class TransacoesServlet extends HttpServlet {
	
	private List<Transacao> transacoes = new ArrayList<>();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		Transacao t1 = new Transacao();
		t1.setTicker("ITSA4");
		t1.setPreco(new BigDecimal("10.0"));
		t1.setQuantidade(100);
		t1.setData(LocalDate.now());
		t1.setTipo(TipoTransacao.COMPRA);

		Transacao t2 = new Transacao();
		t2.setTicker("BBSE3");
		t2.setPreco(new BigDecimal("11.50"));
		t2.setQuantidade(80);
		t2.setData(LocalDate.of(2021, 1, 31));
		t2.setTipo(TipoTransacao.COMPRA);
		
		transacoes.add(t1);
		transacoes.add(t2);
		
		req.setAttribute("transacoes", transacoes);
		
		req.getRequestDispatcher("WEB-INF/jsp/transacoes.jsp").forward(req, res);

		
	}

}
