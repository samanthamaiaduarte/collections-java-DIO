package set.operacoesbasicas.palavrasunicas;

public class UsarConjuntoPalavrasUnicas {

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();
		
		palavras.adicionarPalavra("Bola");
		palavras.adicionarPalavra("Cachorro");
		palavras.adicionarPalavra("Minhoca");
		palavras.adicionarPalavra("Bala");
		palavras.adicionarPalavra("Trem");
		palavras.adicionarPalavra("Cavalo");
		palavras.adicionarPalavra("Cavalo");
		
		palavras.exibirPalavrasUnicas();
		
		System.out.println("Na lista existe a palavra 'Minhoca'? " + (palavras.verificarPalavra("Minhoca") ? "Sim" : "Não"));
		System.out.println("Na lista existe a palavra 'Chicote'? " + (palavras.verificarPalavra("Chicote") ? "Sim" : "Não"));
		
		palavras.removerPalavra("Trem");
		
		palavras.exibirPalavrasUnicas();
	}

}

