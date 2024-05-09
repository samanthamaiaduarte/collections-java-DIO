package set.ordenacao.listaalunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>, Comparator<Aluno> {
	private Long matricula;
	private String nome;
	private Double media;
	
	public Aluno() { }
	
	public Aluno(Long matricula, String nome, Double media) {
		this.matricula = matricula;
		this.nome = nome;
		this.media = media;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	@Override
	public int compare(Aluno aluno1, Aluno aluno2) {
		return Double.compare(aluno1.getMedia(), aluno2.getMedia());
	}

	@Override
	public int compareTo(Aluno aluno) {
		return nome.compareToIgnoreCase(aluno.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", media=" + media + "]";
	}
	
}
