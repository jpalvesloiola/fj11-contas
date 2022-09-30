package br.com.caelum.contas.main;

public class TestaString {

	public static void main(String[] args) {
//		String s = "fj11";
//		s.replaceAll("1", "2");
//		System.out.println(s);

//		String x = new String("fj11");
//		String y = new String("aj11");
//
//		if (x.compareTo(y) < 0) {
//			System.out.println(x + " < " + y);
//		} else if (x.compareTo(y) > 0) {
//			System.out.println(x + " > " + y);
//		} else {
//			System.out.println(x + " = " + y);
//		}

	
		/**
		 * Métodos StringBuilder
		 */

//		StringBuilder nomes = new StringBuilder();
//		nomes.append("Carlos>").append("Maria>").append("José>").append("Renata");
//
//		System.out.println(nomes.toString());
//
//		StringBuilder buffer = new StringBuilder("João Silveira Batista");
//		System.out.printf(
//				" buffer = %s\n tamanho = %d\n capacidade (%d (tamanho) + " + "16(valor inicial padrão)) = %d\n\n",
//				buffer.toString(), buffer.length(), buffer.length(), buffer.capacity());
//
//		// EXPANDE A CAPACIDADE P/ 75 CARACTERES
//		buffer.ensureCapacity(75);
//		System.out.printf("Nova Capacidade = %d\n\n", buffer.capacity());
//
//		// REDEFINE O TAMANHO, NÃO APARECENDO OS CARACTERES
//		// SE O ARGUMENTO FOR MENOR QUE A QUANTIDADE DE CARACTERES ORIGINAL
//		buffer.setLength(10);
//		System.out.printf("Novo tamanho = %d\n buffer = %s\n", buffer.length(), buffer.toString());

//		StringBuilder buffer = new StringBuilder("Usando outros métodos StringBuilder");
//
//		System.out.printf("buffer = %s\n", buffer.toString());
//		System.out.printf("Caractere index 0: %s\nCaractere index 4: " + "%s\n\n", buffer.charAt(0), buffer.charAt(4));
//
//		char[] charArray = new char[buffer.length()];
//
//		buffer.getChars(0, buffer.length(), charArray, 0);
//		System.out.print("Os caracteres são: ");
//
//		for (char c : charArray)
//			System.out.print(c);
//
//		buffer.setCharAt(0, 'O');
//		buffer.setCharAt(4, 'P');
//
//		System.out.printf("\n\nbuffer = %s", buffer.toString());
//
//		buffer.reverse();
//		System.out.printf("\n\nbuffer = %s\n", buffer.toString());
		
		/**
		 * Construtores StringBuilder
		 */
		
//		StringBuilder buffer1 = new StringBuilder();
//	    StringBuilder buffer2 = new StringBuilder(5655);
//	    StringBuilder buffer3 = new StringBuilder("Texto Qualquer");
//
//	    System.out.printf("buffer1 = \"%s\"\n", buffer1.toString());
//	    System.out.printf("buffer2 = \"%s\"\n", buffer2.toString());
//	    System.out.printf("buffer3 = \"%s\"\n", buffer3.toString());
		
		/**
		 * Método insert
		 */
		
//		Object objetoRef = "Maria";
//	    String String = "Joaquina";
//	    char[] conjArray = {'S','i','l','v','a'};
//	    int x = 101;
//
//	    StringBuilder buffer = new StringBuilder();
//	    buffer.insert(0, objetoRef);
//	    buffer.insert(0, " ");
//	    buffer.insert(0, String);
//	    buffer.insert(0, " ");
//	    buffer.insert(0, conjArray);
//	    buffer.insert(0, " ");
//	    buffer.insert(0, x);
//
//	    System.out.printf("Valores:\n%s\n\n", buffer.toString());
		
		
		/**
		 * Método delete
		 */
		
//		Object objetoRef = "Maria";
//	    String String = "Joaquina";
//	    char[] conjArray = {'S','i','l','v','a'};
//
//	    StringBuilder buffer = new StringBuilder();
//
//	    buffer.insert(0, objetoRef);
//	    buffer.insert(0, " ");
//	    buffer.insert(0, String);
//	    buffer.insert(0, " ");
//	    buffer.insert(0, conjArray);
//	    buffer.insert(0, " ");
//	    System.out.printf("Valores antes do delete:\n%s\n\n", buffer.toString());
//
//	    buffer.delete(0, 2);
//	    buffer.deleteCharAt(4);
//	    System.out.printf("Valores depois do delete:\n%s\n\n", buffer.toString());
		
//		String palavra = "anotaram a data da maratona";
//		imprimeLetraPorLetra(palavra);
//		inverteLetraPorLetra(palavra);
//		inverteLetraPorLetraStringBuilder(palavra);
	}

//	public static void imprimeLetraPorLetra(String palavra) {
//		palavra.trim();
//		for (int i = 0; i < palavra.length(); i++) {
//			System.out.print(palavra.charAt(i));
//		}
//		System.out.println();
//	}
//
//	public static void inverteLetraPorLetra(String palavra) {
//		palavra.trim();
//		for (int i = palavra.length() - 1; i >= 0; i--) {
//			System.out.print(palavra.charAt(i));
//		}
//		System.out.println();
//	}
//	public static void inverteLetraPorLetraStringBuilder(String palavra) {
//		StringBuilder invertida = new StringBuilder(palavra);
//		invertida.reverse();
//		System.out.println(invertida);
//	}

}
