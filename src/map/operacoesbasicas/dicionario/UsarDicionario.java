package map.operacoesbasicas.dicionario;

public class UsarDicionario {

	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("Palavra 1", "Definição da palavra 1");
		dicionario.adicionarPalavra("Palavra 2", "Definição da palavra 2");
		dicionario.adicionarPalavra("Palavra 3", "Definição da palavra 3");
		dicionario.adicionarPalavra("Palavra 4", "Definição da palavra 4");
		dicionario.adicionarPalavra("Palavra 5", "Definição da palavra 5");
		dicionario.adicionarPalavra("Palavra 6", "Definição da palavra 6");
		dicionario.adicionarPalavra("Palavra 7", "Definição da palavra 7");
		dicionario.adicionarPalavra("Palavra 8", "Definição da palavra 8");
		dicionario.adicionarPalavra("Palavra 1", "Definição da palavra 9");
		
		dicionario.exibirPalavras();
		
		System.out.println();
		System.out.println("Removendo a 'Palavra 8'");
		dicionario.removerPalavra("Palavra 8");
		dicionario.exibirPalavras();
		
		System.out.println();
		System.out.println("Definição da palavra 'Palavra 5': " + dicionario.pesquisarPorPalavra("Palavra 5"));

	}

}
