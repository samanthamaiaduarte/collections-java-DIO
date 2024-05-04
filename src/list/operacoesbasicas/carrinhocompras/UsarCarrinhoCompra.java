package list.operacoesbasicas.carrinhocompras;

public class UsarCarrinhoCompra {

	public static void main(String[] args) {
		CarrinhoCompra carrinho = new CarrinhoCompra();
		
		carrinho.adicionarItem("Item 1", 50.0, 2);
		carrinho.adicionarItem("Item 2", 70.0, 3);
		carrinho.adicionarItem("Item 3", 20.0, 1);
		
		carrinho.exibirItens();
		System.out.printf("O total atual do carrinho é: %.2f%n", carrinho.calcularValorTotal());

		carrinho.removerItem("Item 3");
		carrinho.exibirItens();
		System.out.printf("O total atual do carrinho é: %.2f%n", carrinho.calcularValorTotal());
	}

}
