package br.com.caelum.contas;

import java.math.BigDecimal;
import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {
	SeguroDeVida seguroDeVida;

	public void criaSeguro(Evento evento) {

		this.seguroDeVida = new SeguroDeVida(new BigDecimal(evento.getString("valor")), evento.getString("titular"),
				evento.getInt("numeroApolice"));
	}
}
