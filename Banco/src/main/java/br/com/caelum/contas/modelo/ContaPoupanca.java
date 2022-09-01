package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, String titular, String agencia) {
		super(numero, titular, agencia);
	}
	
	/**
	 * Retorna o tipo da conta
	 * 
	 * @return
	 */
	@Override
	public String getTipo() {
		return super.getTipo() + " Poupança";
	}

}
