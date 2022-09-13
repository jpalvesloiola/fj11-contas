package br.com.caelum.contas.modelo;

import java.math.BigDecimal;

public class SeguroDeVida implements Tributavel {
	private BigDecimal valor;
	private Cliente titular;
	private int numeroApolice;
	
	public SeguroDeVida() {
		this.titular = new Cliente();
	}
	
	public SeguroDeVida(BigDecimal valor, String titular, int numeroApolice) {
		this();
		this.valor = valor;
		this.titular.setNome(titular);
		this.numeroApolice = numeroApolice;
	}

	/**
	 * Subtrai 2% mais R$ 42,00 do valor da conta Seguro de Vida
	 * 
	 * @return  
	 */
	@Override
	public BigDecimal getValorImposto() {
		return this.valor.multiply(new BigDecimal("0.2")).add(new BigDecimal("48"));
	}
	
	/**
	 * Calculo o imposto do Seguro de Vida
	 * 
	 * @return String
	 */
	@Override
	public String getTipo() {
		return "Seguro de Vida";
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular.getNome();
	}

	/**
	 * @return the numeroApolice
	 */
	public int getNumeroApolice() {
		return numeroApolice;
	}

}
