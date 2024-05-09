package set.pesquisa.agendacontato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
	private Set<Contato> contatos;
	
	public AgendaContato() {
		contatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, long numero) {
		contatos.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatos);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPesquisa = new HashSet<>();
		for(Contato contato : contatos) {
			if(contato.getNome().startsWith(nome))
				contatosPesquisa.add(contato);
		}
		
		return contatosPesquisa;
	}
	
	public Contato atualizarNumeroContato(String nome, long novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato contato : contatos) {
			if(contato.getNome().equalsIgnoreCase(nome)) {
				contato.setNumero(novoNumero);
				contatoAtualizado = contato;
				break;
			}
		}
		
		return contatoAtualizado;
	}
}
