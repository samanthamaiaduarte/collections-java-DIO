package set.ordenacao.cadastroproduto;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>, Comparator<Produto> {
	private long codigo;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() { }
	
	public Produto(long codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public int compareTo(Produto produto) {
		return nome.compareToIgnoreCase(produto.getNome());
	}
	
	@Override
	public int compare(Produto produto1, Produto produto2) {
		return Double.compare(produto1.getPreco(), produto2.getPreco());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
}
