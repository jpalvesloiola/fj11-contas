package br.com.caelum.contas;

import java.math.BigDecimal;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

/**
 * A tela precisa conhecer alguém que saiba executar as ações de saque e
 * depósito na conta e que consiga buscar os dados da tela para popular a conta.
 * Então, a classe ManipuladorDeContas, que será responsável por fazer esta
 * "ponte" entre a tela e a classe de Conta
 * 
 * @author jpalv
 *
 */
public class ManipuladorDeContas {
	Conta conta;

	public ManipuladorDeContas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Resposável por criar uma conta e popular dados na interface através do
	 * parâmetro evento.
	 * 
	 * @param evento
	 */
	public void criaConta(Evento evento) {
		this.conta = new Conta(56789, BigDecimal.ZERO, "Batman", "1234");
	}

	/**
	 * Recebe o valor da interface através do parâmetro evento e chama o método
	 * deposita da classe conta.
	 * 
	 * @param evento
	 */
	public void deposita(Evento evento) {
		BigDecimal valor = new BigDecimal(evento.getDouble("valor"));
		this.conta.deposita(valor);
	}

	/**
	 * Recebe o valor da interface através do parâmetro evento e chama o método saca
	 * da classe conta.
	 * 
	 * @param evento
	 */
	public void saca(Evento evento) {
		BigDecimal valor = new BigDecimal(evento.getDouble("valor"));
		this.conta.saca(valor);
	}

}
