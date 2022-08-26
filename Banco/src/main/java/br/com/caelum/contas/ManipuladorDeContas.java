package br.com.caelum.contas;

import java.math.BigDecimal;

import br.com.caelum.contas.modelo.Cliente;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	Conta conta;
	
	public ManipuladorDeContas() {
		// TODO Auto-generated constructor stub
	}

	public void criaConta(Evento evento) {
		this.conta = new Conta(56789, BigDecimal.ZERO, "Batman", "1234");
	}
	
	public void deposita(Evento evento) {
		BigDecimal valor = new BigDecimal(evento.getDouble("valor"));
		this.conta.deposita(valor);
	}
	
	public void saca(Evento evento) {
		BigDecimal valor = new BigDecimal(evento.getDouble("valor"));
		this.conta.saca(valor);
	}	

}
