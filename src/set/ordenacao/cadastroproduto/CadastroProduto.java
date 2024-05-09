package set.ordenacao.cadastroproduto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

	Set<Produto> produtos;
	
	public CadastroProduto() {
		produtos = new HashSet<>();
	}
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtos.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosNome = new TreeSet<>(produtos);
		return produtosNome;
		
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPreco = new TreeSet<>(new Produto());
		produtosPreco.addAll(produtos);
		return produtosPreco;
	}
}
