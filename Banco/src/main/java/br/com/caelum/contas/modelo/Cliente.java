package br.com.caelum.contas.modelo; //Fully Qualified Name de uma classe
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String sobreNome, String cpf, int idade) {
		this.nome = nome;
		this.sobrenome = sobreNome;
		this.validaCPF(cpf);
		this.idade = idade;
	}

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

	public void mudaCPF(String cpf) {
		if (this.validaCPF(cpf)) {
			this.cpf = cpf;
		} else {
			System.out.println("CPF Invalido!");
		}
	}

	@Override
	public String toString() {
		String dados = "";
		dados += "Nome: " + this.nome;
		dados += "\nSobrenome: "+ this.sobrenome;
		dados += "\nCPF: "+ this.cpf;
		dados += "\nIdade: "+ this.idade;
        
        return dados;
	}
	
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
