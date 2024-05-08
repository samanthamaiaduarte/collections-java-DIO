package list.ordenacao.pessoas;

public class UsarOrdenacaoPessoa {

	public static void main(String[] args) {
		OrdenacaoPessoa pessoas = new OrdenacaoPessoa();
		
		pessoas.adicionarPessoa("Maria", 25, 1.65);
		pessoas.adicionarPessoa("Alex", 15, 1.55);
		pessoas.adicionarPessoa("João", 18, 1.85);
		pessoas.adicionarPessoa("Anna", 35, 1.65);
		pessoas.adicionarPessoa("Elsa", 28, 1.75);
		pessoas.adicionarPessoa("Pedro", 45, 1.85);
		pessoas.adicionarPessoa("Bob", 25, 1.90);
		pessoas.adicionarPessoa("Beto", 20, 1.85);
		
		System.out.println("Pessoas Ordenadas por Altura");
		System.out.println(pessoas.ordenarPorAltura());
		
		System.out.printf("%nPessoas Ordenadas por Idade%n");
		System.out.println(pessoas.ordenarPorIdade());
	}

}
