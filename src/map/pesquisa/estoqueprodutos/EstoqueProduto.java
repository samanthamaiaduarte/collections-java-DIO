package map.pesquisa.estoqueprodutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
	private Map<Long, Produto> produtos;
	
	public EstoqueProduto() {
		produtos = new HashMap<>();
	}
	
	public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
		produtos.put(codigo, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(produtos);
	}
	
	public Double calcularValorTotalEstoque() {
		double totalEstoque = 0.0;

		if(!produtos.isEmpty()) {
			for(Produto produto : produtos.values()) {
				totalEstoque += produto.getPreco() * produto.getQuantidade();
			}
		}
		
		return totalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto maisCaro = null;
		
		if(!produtos.isEmpty()) {
			for(Produto produto : produtos.values()) {
				if(maisCaro == null || maisCaro.getPreco() < produto.getPreco())
					maisCaro = produto;
			}
		}
		
		return maisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto maisBarato = null;
		
		if(!produtos.isEmpty()) {
			for(Produto produto : produtos.values()) {
				if(maisBarato == null || maisBarato.getPreco() > produto.getPreco())
					maisBarato = produto;
			}
		}
		
		return maisBarato;		
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto maiorTotal = null;
		
		if(!produtos.isEmpty()) {
			for(Produto produto : produtos.values()) {
				if(maiorTotal == null || maiorTotal.getPreco() * maiorTotal.getQuantidade() < produto.getPreco() * produto.getQuantidade())
					maiorTotal = produto;
			}
		}
		
		return maiorTotal;
	}
}
