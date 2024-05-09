package map.pesquisa.contagempalavras;

public class UsarContagemPalavra {

	public static void main(String[] args) {
		ContagemPalavra palavras = new ContagemPalavra();
		
		palavras.adicionarPalavra("Marca", 10);
		palavras.adicionarPalavra("Texto", 18);
		palavras.adicionarPalavra("Conta", 7);
		palavras.adicionarPalavra("Bom", 25);
		palavras.adicionarPalavra("Repete", 5);
		palavras.adicionarPalavra("Valor", 2);
		palavras.adicionarPalavra("Tudo", 27);
		
		palavras.exibirContagemPalavras();
		
		System.out.println();
		System.out.println("Remover a palavra 'Bom'");
		palavras.removerPalavra("Bom");
		palavras.exibirContagemPalavras();
		
		System.out.println();
		System.out.println("A palavra mais frequente é: " + palavras.encontrarPalavraMaisFrequente());
	}

}
