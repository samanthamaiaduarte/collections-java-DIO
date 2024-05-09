package map.pesquisa.estoqueprodutos;

public class Produto {
	private String nome;
	private Integer quantidade;
	private Double preco;
	
	public Produto() { }
	
	public Produto(String nome, Integer quantidade, Double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}

}
