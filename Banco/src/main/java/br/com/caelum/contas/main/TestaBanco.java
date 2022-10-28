package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco banco = new Banco("CaelumBank", 999);
		
		for (int i = 0; i < 40; i++) {
			  ContaCorrente contaCorrente = new ContaCorrente(i, "João_" + i, "1" + i);
			  banco.adiciona(contaCorrente);
		}		
		
		banco.mostraContas();
	}
}
