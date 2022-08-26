package br.com.caelum.contas.modelo; //Fully Qualified Name de uma classe

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe responsável por moldar contas do Banco
 * 
 * @author João Pedro Alves Loiola
 *
 */
public class Conta {

	private int numero;
	private BigDecimal saldo = BigDecimal.ZERO;
	private double limite;
	private Cliente titular;
	private String agencia;
	private LocalDateTime dataDeAbertura;
	private static int totalDeContas = 0; // Armazena o total de contas criadas

	// construtores

	public Conta() {
		System.out.println("Construindo uma conta...");
		Conta.totalDeContas += 1;
		this.dataDeAbertura = LocalDateTime.now();
		this.titular = new Cliente();
	}

	public Conta(int numero, BigDecimal saldo, String titular, String agencia) {
		this(); // chama construtor anterior
		this.numero = numero;
		this.saldo = saldo;
		this.titular.setNome(titular);
		this.agencia = agencia;
	}

	/**
	 * Incrementa o Saldo, realizando o depósito de um valor na conta
	 * 
	 * @param valor
	 */
	public void deposita(BigDecimal valor) {
		if (valor.compareTo(BigDecimal.ZERO) > 0) {
			this.saldo = this.saldo.add(valor);
		} else {
			System.out.println("Valor invalido!");
		}
	}

	/**
	 * Decrementa o Saldo. Realiza o saque se o valor, a ser sacado, for compatível
	 * com o Saldo
	 * 
	 * @param valor
	 */
	public void saca(BigDecimal valor) {
		if (this.saldo.compareTo(valor) >= 0) {
			this.saldo = this.saldo.subtract(valor);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	/**
	 * Aplica rendimento sobre o Saldo
	 * 
	 * @param valor
	 * @return
	 */
	public BigDecimal getRendimento() {
		BigDecimal rendimento = new BigDecimal("0.1");
		return this.saldo.multiply(rendimento);
	}

	/**
	 * Transfere um valor de uma conta para outra
	 * 
	 * @param contaDestino
	 * @param valor
	 */
	public void transferePara(Conta contaDestino, BigDecimal valor) {
		this.saca(valor);
		contaDestino.deposita(valor);
	}

	/**
	 * Imprime todos os dados da Conta e do Titular
	 */
	@Override
	public String toString() {
		String dados = "";
		dados += "\nTitular:";
		dados += "\n	Nome: " + this.titular.getNome();
		dados += "\n	Sobrenome: " + this.titular.getSobrenome();
		dados += "\n	Idade: " + this.titular.getIdade();
		dados += "\n	CPF: " + this.titular.getCpf();
		dados += "\nConta:";
		dados += "\n	Agencia: " + this.agencia;
		dados += "\n	Saldo: R$" + this.saldo;
		dados += "\n	Limite: R$" + this.limite;
		dados += "\n\n	Data de Abertura: " + this.getDataDeAbertura();

		return dados;
	}

	// getters and setters

	public BigDecimal getSaldo() {
		return this.saldo;
	}

	public double getLimite() {
		return this.limite;
	}

	public String getTitular() {
		return this.titular.getNome();
	}

	public void setTitular(String titular) {
		this.titular.setNome(titular);
	}

	/**
	 * Retorna o total de contas criadas
	 * 
	 * @return
	 */
	public static int getTotalDeContas() {
		return totalDeContas;
	}

	/**
	 * Retorna a Data de abertura da conta
	 * 
	 * @return
	 */
	public String getDataDeAbertura() {
		return dataDeAbertura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Altera o Saldo da conta. Chama o método deposita para garantir o
	 * encapsulamento do atributo Saldo.
	 * 
	 * @param saldo
	 */
	public void setSaldo(BigDecimal saldo) {
		this.deposita(saldo);
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String string) {
		this.agencia = string;
	}

}
