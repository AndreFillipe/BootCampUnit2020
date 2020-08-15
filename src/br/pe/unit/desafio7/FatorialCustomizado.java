package br.pe.unit.desafio7;

/**
 * 
 * @author Andre Fillipe 15/08/2020
 */
public class FatorialCustomizado {

	public static void main(String[] args) {
		int num = numeroASerUsado(6);
		int fatorial = fatorial(num);
		System.out.println(fatorial);
		num = numeroASerUsado(10);
		fatorial = fatorial(num);
		System.out.println(fatorial);
		num = numeroASerUsado(50);
		fatorial = fatorial(num);
		System.out.println(fatorial);
	}

	private static int fatorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fatorial(num - 1);
	}

	private static int numeroASerUsado(int intervalo) {
		int somaPares = 0, somaImpares = 0;
		for (int i = 1; i <= intervalo; i++) {
			if (i % 2 == 0) {
				somaPares += i;
			} else {
				somaImpares += i;
			}
		}
		return somaPares - somaImpares;
	}
}
