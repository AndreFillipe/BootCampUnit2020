package br.pe.unit.desafio6;
/**
 * 
 * @author Andre Fillipe
 * 15/08/2020
 */
import br.pe.unit.desafio4.ContarPalavras;

public class MaiorPalavra {

	public static void main(String[] args) {
		String[] palavras = ContarPalavras.contarPalavrasEmFrase("Hoje é o desafio vai ser legal");
		System.out.println("Maior Palavra = " + checarMaiorPalavra(palavras));
		palavras = ContarPalavras.contarPalavrasEmFrase("Amanhã é quarta e eu vou à praia");
		System.out.println("Maior Palavra = " + checarMaiorPalavra(palavras));
	}

	private static String checarMaiorPalavra(String[] palavras) {
		//pondo primeira palavra como a maior... checaremos se isso é verdade
		String maiorPalavra = palavras[0];
		for (int i = 0; i < palavras.length; i++) {
			
			if(palavras[i].length() > maiorPalavra.length()) {
				maiorPalavra = palavras[i];
			}
		}
		return maiorPalavra;
	}
}
