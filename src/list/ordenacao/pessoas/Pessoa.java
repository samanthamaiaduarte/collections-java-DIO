package list.ordenacao.pessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private Integer idade;
	private Double altura;
	
	public Pessoa(String nome, Integer idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}

	@Override
	public int compareTo(Pessoa p) {
		return Integer.compare(this.idade, p.getIdade());
	}

}

class ComparatorPorAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
	
}
