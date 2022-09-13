package br.com.caelum.contas.modelo;

import java.math.BigDecimal;

public abstract interface Tributavel {

	public BigDecimal getValorImposto();

	String getTipo();
}
