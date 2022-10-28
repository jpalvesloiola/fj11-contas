package br.com.caelum.contas.modelo;

public class Banco {
	private int numContas;
	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.numContas = 0;
		this.contas = new Conta[10];
	}

	public void adiciona(Conta c) {
		if (numContas  >= this.contas.length) {
			this.aumentaArray();	
		}
			contas[numContas] = c;
			numContas++;
		
		
	}

	private void aumentaArray() {
		var contaMaior = new Conta[this.contas.length * 2];
		for (int i = 0; i < this.contas.length; i++) {
			contaMaior[i] = this.contas[i];
		}
		this.contas = contaMaior;
	}

	public void mostraContas() {
		int i = 0;
		for (Conta conta : contas) {
			System.out.println("\n\nConta na posição " + i++);
			System.out.println(conta);
		}
	}

	public boolean contem(Conta conta) {
		for (Conta contaSalva : contas) {
			if (contaSalva.equals(conta)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return the contas
	 */
	public Conta[] getContas() {
		return contas;
	}

}
