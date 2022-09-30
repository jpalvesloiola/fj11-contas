package br.com.caelum.contas.main;

public class DesafioConversaoDeNumeros {
	public static void main(String[] args) {
		String x = "762";	//global
		
		/**
//		 * Primeira solucao                                                                                                                  
		 */
//		int i = 0;
//		
//		char c = x.charAt(0);
//		i = i + 100 * (c - '0');
//		c = x.charAt(1);
//		i = i + 10 * (c - '0');
//		c = x.charAt(2);
//		i = i + (c - '0');
//		System.out.println(i);
		
		/**
		 * Segunda solucao 
		 */
		int y = converteParaInt(x);
	    
	    System.out.println(y);
	}

	public static int converteParaInt(String x) {
		int i = 0;
		while (x.length() > 0) {
			char c = x.charAt(0);
			i = i * 10 + (c - '0');
			x = x.substring(1);
		}
		return i;
	}
}
