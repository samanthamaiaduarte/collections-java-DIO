package set.operacoesbasicas.conjuntoconvidados;

import java.util.Objects;

public class Convidado {
	private String nome;
	private Integer codigoConvite;
	
	public Convidado(String nome, Integer codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigoConvite() {
		return codigoConvite;
	}

	public void setCodigoConvite(Integer codigoConvite) {
		this.codigoConvite = codigoConvite;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(codigoConvite, other.codigoConvite);
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}
	
	
}
