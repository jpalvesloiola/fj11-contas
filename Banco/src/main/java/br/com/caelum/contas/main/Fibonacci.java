package br.com.caelum.contas.main;

public class Fibonacci {
	public static void main(String[] args) {

		// recursividade sem cache
		System.out.println("Fibonacci Recursivo sem Cache:");
		long tempoInicial = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			System.out.print(Fibonacci.fibonacciRecursivo(i) + " ");
		}
		System.out.println("\no metodo executou em " + (System.currentTimeMillis() - tempoInicial) + "ms");
		

		// recursividade com cache
		System.out.println("\n\nFibonacci Recursivo com Cache:");
		tempoInicial = System.currentTimeMillis();
		for (int i = 1; i < 25  ; i++) {
			System.out.print(Fibonacci.fibonacciRecursivoCache(i) + " ");
		}
		System.out.println("\no metodo executou em " + (System.currentTimeMillis() - tempoInicial) + "ms");
		
		
		System.out.println("\n\nFibonacci Normal:");
		tempoInicial = System.currentTimeMillis();
		// normal ate 100
		Fibonacci.fibonacci();
	
		System.out.println("\no metodo executou em " + (System.currentTimeMillis() - tempoInicial) + "ms");
	}

	public static void fibonacci() {
		int anterior = 0;
		int atual = 1;
		while (anterior < 4181) {
			System.out.print(atual + " ");
			atual = anterior + atual;
			anterior = atual - anterior;
		}
	}

	public static int fibonacciRecursivo(int n) {
		
		return (n < 2) ? 1 : (fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2));
	}

	public static int fibonacciRecursivoCache(int n) {
		int[] valores = new int[2000];
		valores[1] = 1;
		if (n == 0)
			return 0;

		// Retornamos valores já calculados diretamente
		if (valores[n] != 0)
			return valores[n];

		// Caso contrário, calculamos e guardamos o valor calculado
		valores[n] = fibonacciRecursivoCache(n - 1) + fibonacciRecursivoCache(n - 2);

		return valores[n]; // Retornamos o valor calculado
	}
}
