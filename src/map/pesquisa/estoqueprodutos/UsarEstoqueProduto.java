package map.pesquisa.estoqueprodutos;

public class UsarEstoqueProduto {

	public static void main(String[] args) {
		EstoqueProduto produtos = new EstoqueProduto();
		
		produtos.adicionarProduto(1001L, "Bola", 10, 5.0);
		produtos.adicionarProduto(1002L, "Bike", 2, 150.0);
		produtos.adicionarProduto(1003L, "Boneca", 5, 75.0);
		produtos.adicionarProduto(1004L, "Corda", 3, 15.0);
		produtos.adicionarProduto(1005L, "Balão", 5, 10.0);
		
		produtos.exibirProdutos();
		
		System.out.println("O valor total do estoque é: " + produtos.calcularValorTotalEstoque());
		
		System.out.println();
		System.out.println("O produto mais caro é:");
		System.out.println(produtos.obterProdutoMaisCaro());

		System.out.println();
		System.out.println("O produto mais barato é:");
		System.out.println(produtos.obterProdutoMaisBarato());
		
		System.out.println();
		System.out.println("O produto com maior valor total em estoque é:");
		System.out.println(produtos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());		
	}

}
