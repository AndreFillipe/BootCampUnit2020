package br.pe.unit.desafio8;
/**
 * 
 * @author Andre Fillipe 15/08/2020
 */

public class Equacao2Grau {

	public static void main(String[] args) {
		calcular(1,-5,4);
		calcular(1,2,1);
		calcular(7,6,2);
	}

	private static void calcular(int a,int b , int c) {
		double delta = Math.pow(b, 2) - 4*a*c;
		double x1 = (-b - Math.sqrt(delta))/2*a;
		double x2 = (-b + Math.sqrt(delta))/2*a;
		
		System.out.println("X1= " + x1);
		System.out.println("X2= " + x2);
	}
}
