package br.com.caelum.contas.modelo; //Fully Qualified Name de uma classe

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe responsável por moldar clientes da Conta
 * 
 * @author jpalv
 *
 */
public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;

	// construtores
	public Cliente() {

	}

	public Cliente(String nome, String sobreNome, String cpf, int idade) {
		this.nome = nome;
		this.sobrenome = sobreNome;
		this.validaCPF(cpf);
		this.idade = idade;
	}

	/**
	 * Valida o CPF com expressão regular. Caso seja compatível com o padrão
	 * definido retorna true caso contrário retorna false
	 * 
	 * @param cpf
	 * @return
	 */
	public boolean validaCPF(String cpf) {
		Matcher m = Pattern.compile("^\\d{3}[.]\\d{3}[.]\\d{3}[-]\\d{2}$").matcher(cpf);
		if (m.matches()) {
			this.cpf = cpf;
			return true;
		} else {
			System.out.println("CPF Invalido!");
			return false;
		}
	}

	/**
	 * Altera o cpf. Utiliza o método validaCPF() para validar antes que a alteração
	 * ocorra.
	 * 
	 * @param cpf
	 */
	public void mudaCPF(String cpf) {
		if (this.validaCPF(cpf)) {
			this.cpf = cpf;
		} else {
			System.out.println("CPF Invalido!");
		}
	}
	
	/**
	 * Imprime todas as informações do Cliente.
	 */
	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Titular:");
		dados.append("\n	Nome: " + this.getNome().toUpperCase());
		dados.append("\n	Sobrenome: " + this.getSobrenome());
		dados.append("\n	Idade: " + this.getIdade());
		dados.append("\n	CPF: " + this.getCpf());

		return dados.toString();
	}

	//getters and setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public int getIdade() {
		return idade;
	}

}
