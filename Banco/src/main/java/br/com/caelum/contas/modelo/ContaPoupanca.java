package br.com.caelum.contas.modelo;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, String titular, String agencia) {
		super(numero, titular, agencia);
	}

	/**
	 * Subtrai o Saldo, realizando o saque se o valor, a ser sacado, for maior ou
	 * igual ao Saldo.
	 * 
	 * @param valor
	 */
	@Override
	public void saca(BigDecimal valor) {
		if (valor.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Valor inválido.");
		} else if (this.saldo.compareTo(valor) < 0) {
			throw new SaldoInsuficienteException(valor);
		} else {
			this.saldo = this.saldo.subtract(valor);
		}
	}

	/**
	 * Retorna o tipo da conta
	 * 
	 * @return
	 */
	@Override
	public String getTipo() {
		return "Conta Poupança";
	}

}
