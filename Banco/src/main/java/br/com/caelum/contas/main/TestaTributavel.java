package br.com.caelum.contas.main;

import java.math.BigDecimal;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(0, null, null);
        cc.deposita(BigDecimal.valueOf(100));
        System.out.println(cc.getValorImposto());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(cc.getSaldo());
        System.out.println(t.getValorImposto());
	}

}
