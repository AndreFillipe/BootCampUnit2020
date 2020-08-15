package br.pe.unit.desafio1;
/**
 * 
 * @author Andre Fillipe
 * 15/08/2020
 */
public class RainhaEOMonge {
	public static void main(String[] args) {
		calcular(64.0, 1.0);
	}
/**
 * 
 * @param qtdCasas
 * @param qtdGraosPrimeiraCasa
 */
	private static void calcular(double qtdCasas, double qtdGraosPrimeiraCasa) {
		double casas[] = new double[(int) qtdCasas];
		double soma = qtdGraosPrimeiraCasa;
		
		for (int i = 0; i < casas.length; i++) {
			if(i==0) {
				casas[i] = qtdGraosPrimeiraCasa;
			}
			else {
				casas[i] = casas[i-1]*2;
				soma += casas[i]; 
			}
			System.out.println("Casa: " +(i+1) + "-  Qtd: " +casas[i] + " Soma: " +soma);
		}	
	}
}
