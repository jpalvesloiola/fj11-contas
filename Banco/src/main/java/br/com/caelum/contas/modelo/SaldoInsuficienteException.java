package br.com.caelum.contas.modelo;

import java.math.BigDecimal;

public class SaldoInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
	
	public SaldoInsuficienteException(BigDecimal valor) {
		super("Saldo insuficiente para sacar o valor de: " + valor);
	}
	
}
