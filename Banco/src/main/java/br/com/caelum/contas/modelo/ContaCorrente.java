package br.com.caelum.contas.modelo;

import java.math.BigDecimal;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, String titular, String agencia) {
		super(numero, titular, agencia);
	}

	/**
	 * Decrementa o Saldo. Realiza o saque, se o valor a ser sacado for compatível
	 * com o Saldo. Tira 10 centavos de cada saque em uma conta corrente.
	 * 
	 * @param valor
	 */
	@Override
	public void saca(BigDecimal valor) {
		BigDecimal valorDoSaqueComTaxa = this.saldo.subtract(valor.add(new BigDecimal("0.1")));
		if (valor.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Valor inválido.");
		} else if (this.saldo.compareTo(valor) < 0) {
			throw new SaldoInsuficienteException(valor);
		} else if (valorDoSaqueComTaxa.compareTo(BigDecimal.ZERO) < 0) {
			throw new SaldoInsuficienteException(
					"Saldo insuficiente!\n"
					+ "R$ " + valor + "(valor do saque) + R$ 0.1(taxa do saque).");
		} else {
			this.saldo = valorDoSaqueComTaxa;
		}
	}

	/**
	 * Retorna o tipo da conta
	 * 
	 * @return String
	 */
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	/**
	 * Calculo o imposto da Conta Corrente
	 * 
	 * @return
	 */
	@Override
	public BigDecimal getValorImposto() {
		return this.saldo.multiply(new BigDecimal("0.01"));
	}
}
