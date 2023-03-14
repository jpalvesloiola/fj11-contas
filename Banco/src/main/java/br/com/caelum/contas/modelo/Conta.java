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
public abstract class Conta {

	private int numero;
	protected BigDecimal saldo = BigDecimal.ZERO;
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

	public Conta(int numero, String titular, String agencia) {
		this(); // chama construtor anterior
		this.numero = numero;
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
			throw new IllegalArgumentException("Valor invalido!");
		}
	}

	/**
	 * Decrementa o Saldo. Realiza o saque se o valor, a ser sacado, for compatível
	 * com o Saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException 
	 */
	public abstract void saca(BigDecimal valor) throws SaldoInsuficienteException;

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
	 * @throws SaldoInsuficienteException
	 */
	public void transferePara(Conta contaDestino, BigDecimal valor) {
		try {
			this.saca(valor);
		} catch (SaldoInsuficienteException e) {
			e.getMessage();
		}
		contaDestino.deposita(valor);
	}

	/**
	 * Retorna o tipo da conta
	 * 
	 * @return
	 */
	public abstract String getTipo();

	/**
	 * Considera duas contas com o mesmo número e agência iguais
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Conta)) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return outraConta.numero == this.numero && outraConta.agencia.equals(this.agencia);
	}

	/**
	 * Imprime todos os dados da Conta e do Titular
	 */
	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Titular:");
		dados.append("\n	Nome: " + this.titular.getNome().toUpperCase());
		dados.append("\n	Sobrenome: " + this.titular.getSobrenome());
		dados.append("\n	Idade: " + this.titular.getIdade());
		dados.append("\n	CPF: " + this.titular.getCpf());
		dados.append("\nConta:");
		dados.append("\n	Tipo: " + this.getTipo());
		dados.append("\n	Número: " + this.getNumero());
		dados.append("\n	Agencia: " + this.getAgencia());
		dados.append("\n	Saldo: R$ " + this.getSaldo().setScale(2));
		dados.append("\n	Limite: R$" + this.getLimite());
		dados.append("\n	Data de Abertura: " + this.getDataDeAbertura());

		return dados.toString();
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

	public String getAgencia() {
		return agencia;
	}
}
