package br.com.caelum.contas;

import java.math.BigDecimal;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {
	private BigDecimal total;

	public BigDecimal calculaImpostos(Evento evento) {
		total = BigDecimal.ZERO;
		int tamanho = evento.getTamanhoDaLista("listaTributaveis");
		for (int i = 0; i < tamanho; i++) {
			Tributavel t = evento.getTributavel("listaTributaveis", i);
			total = total.add(t.getValorImposto());
		}
		
		return total;
	}
}
