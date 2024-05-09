package map.operacoesbasicas.agendacontato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
	private Map<String, Long> contatos;

	public AgendaContato() {
		contatos = new HashMap<>();
	}

	public void adicionarContato(String nome, Long telefone) {
		contatos.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!contatos.isEmpty()) {
			contatos.remove(nome);
		}
	}

	public void exibirContatos() {
		System.out.println(contatos);
	}

	public Long pesquisarPorNome(String nome) {
		Long telefone = null;
		
		if (!contatos.isEmpty()) {
			telefone = contatos.get(nome);
		}
		
		return telefone;
	}
}
