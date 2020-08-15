package br.pe.unit.desafio4;
/**
 * 
 * @author Andre Fillipe
 * 15/08/2020
 */
public class ContarPalavras {
	
	
	public static void main(String[] args) {
		System.out.println("TOTAL DE PALAVRAS = " +contarPalavrasEmFrase("HOJE FAREMOS NOSSO DESAFIO").length);
		System.out.println("TOTAL DE PALAVRAS = " +contarPalavrasEmFrase("HOJE VOU ME DAR MUITO   BEM").length);
		System.out.println("TOTAL DE PALAVRAS = " +contarPalavrasEmFrase("A ARARA FUGIU").length);
	}
/**
 * 
 * @param frase
 * @return array de strings(palavras)
 */
	public static String[] contarPalavrasEmFrase(String frase) {
		
		String fraseAlterada = removerEspacosESubstituirDoisOuMaisPorUm(frase);
		return fraseAlterada.split(" ");
	}
	/**
	 * 
	 * @param frase
	 * @return frase com apenas um espaço entre palavras
	 */
	public static String removerEspacosESubstituirDoisOuMaisPorUm(String frase) {
		frase= new String(frase).trim().replaceAll("\\s{2,}", " ");
		return frase;
	}
}
