package set.ordenacao.cadastroproduto;

public class UsarCadastroProduto {

	public static void main(String[] args) {
		CadastroProduto produtos = new CadastroProduto();
		
		produtos.adicionarProduto(1001L, "Bola", 10.0, 200);
		produtos.adicionarProduto(1002L, "Casa", 150.0, 5);
		produtos.adicionarProduto(1003L, "Balde", 5.0, 20);
		produtos.adicionarProduto(1004L, "Carro", 15.0, 80);
		produtos.adicionarProduto(1005L, "Boneca", 25.0, 100);
		produtos.adicionarProduto(1006L, "Bike", 250.0, 2);
		
		System.out.println(produtos);
		
		System.out.println("Produtos em ordem alfabética:");
		System.out.println(produtos.exibirProdutosPorNome());
		
		System.out.println();
		System.out.println("Produtos em ordem de preço:");
		System.out.println(produtos.exibirProdutosPorPreco());

	}

}
