package set.operacoesbasicas.conjuntoconvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
	private Set<Convidado> convidados;
	
	public ConjuntoConvidado() {
		this.convidados = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		for(Convidado convidado : convidados) {
			if(convidado.getCodigoConvite() == codigoConvite) {
				convidados.remove(convidado);
				break;
			}
		}
	}
	
	public int contarConvidados() {
		return convidados.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidados);
	}
}
