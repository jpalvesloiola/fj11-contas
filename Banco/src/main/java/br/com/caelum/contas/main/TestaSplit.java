package br.com.caelum.contas.main;

public class TestaSplit {
	public static void main(String[] args) {
		String frase = "Socorram-me, subi no ônibus em Marrocos" ;
		String[] palavras = frase.split(" ");
		
		for (int i = palavras.length; i < 0; i--) {
			System.out.print(palavras[i]);
		}
	}
}
