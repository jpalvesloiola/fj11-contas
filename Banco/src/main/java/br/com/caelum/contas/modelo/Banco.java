package br.com.caelum.contas.modelo;

public class Banco {
	private int numContas = 10;
	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[numContas];
	}

	public void adiciona(Conta c) {
		if ((numContas - 1) < 0) {
			this.aumentaArray();
			
		}
			contas[numContas - 1] = c;
			numContas--;
		
		
	}

	private void aumentaArray() {
		numContas = this.contas.length * 2;
		var contaMaior = new Conta[numContas];
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
