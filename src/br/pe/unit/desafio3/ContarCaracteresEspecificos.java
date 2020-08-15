package br.pe.unit.desafio3;
/**
 * 
 * @author Andre Fillipe
 * 15/08/2020
 */
public class ContarCaracteresEspecificos {

	public static void main(String[] args) {
		System.out.println(imprimirQtdCaracteresEspecifico("HOJE FAREMOS NOSSO DESAFIO", 'A'));
		System.out.println(imprimirQtdCaracteresEspecifico("ESTE QUESITO NÃO É TRIVIAL", 'A'));
		System.out.println(imprimirQtdCaracteresEspecifico("A ARARA FUIU DA GAIOLA", 'A'));
	}
/**
 * 
 * @param frase
 * @param caracterABuscar
 * @return quantidade de caracteres específicos
 */
	private static int imprimirQtdCaracteresEspecifico(String frase, char caracterABuscar) {
		int count = 0;
		char letra;
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);

			if (letra == caracterABuscar) {
				count++;
			}
		}
		return count;
	}

}
