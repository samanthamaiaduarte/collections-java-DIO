package list.operacoesbasicas.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	private List<Item> carrinho;
	
	public CarrinhoCompra() {
		carrinho = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinho.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> remover = new ArrayList<>();
		
		for(Item item : carrinho) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				remover.add(item);
			}
		}
		
		carrinho.removeAll(remover);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0;
		
		for(Item item : carrinho) {
			valorTotal += item.getPreco() * item.getQuantidade();
		}
		
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(carrinho);
	}
}
