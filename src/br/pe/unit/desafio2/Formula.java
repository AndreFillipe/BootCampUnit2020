package br.pe.unit.desafio2;
/**
 * 
 * @author Andre Fillipe
 * 15/08/2020
 */
public class Formula {
	
	public static void main(String[] args) {
		System.out.println("A= " + calcular(3.0));
		System.out.println("A= " + calcular(5.0));
		System.out.println("A= " + calcular(10.0));
	}

	private static double calcular(double num) {
		double A = 0;
		
		for (int i = 0; i < num; i++) {
			
			A += ((num-i)/(i+1));
			/*if(i==num-1) {
				operacao+= (1/num); 
			}*/
		}
		return A;
	}
}