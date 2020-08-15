package br.pe.unit.desafio5;
/**
 * 
 * @author Andre Fillipe
 * 15/08/2020
 */
public class Calculo {

	public static void main(String[] args) {
		fibonacci(5);
		System.out.println();
		fibonacci(10);
		System.out.println();
		fibonacci(4);
	}

	private static void fibonacci(int N) {
		int[] numeros = new int[N];
		for (int i = 0; i < N; i++) {
			if(i<=1) {
				numeros[i] = 1;
			}
			else {
				numeros[i] = numeros[i-1] + numeros[i-2];
			}
			System.out.print(numeros[i] + "\t");
		}
	}

}