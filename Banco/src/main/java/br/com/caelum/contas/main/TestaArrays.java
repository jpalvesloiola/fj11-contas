package br.com.caelum.contas.main;

import java.math.BigDecimal;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		BigDecimal media = BigDecimal.ZERO;
		
		
		for (int i = 0; i < contas.length; i++) {
			contas[i] = new ContaCorrente(i, null, null);
			try {
				contas[i].deposita(new BigDecimal(i * 100));
			}catch(IllegalArgumentException e) {
				e.getMessage();
			}
		}
		
		for (Conta conta : contas) {
			media = media.add(conta.getSaldo()); 
		}
		System.out.println(media.divide(new BigDecimal(contas.length)));

	}

}
