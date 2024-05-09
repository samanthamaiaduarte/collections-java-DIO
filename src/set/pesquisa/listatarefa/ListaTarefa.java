package set.pesquisa.listatarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
	private Set<Tarefa> tarefas;
	
	public ListaTarefa() {
		tarefas = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao, false));
	}
	
	public void removerTarefa(String descricao) {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefas.remove(tarefa);
				break;
			}
		}
	}
	
	public void exibirTarefas() {
		System.out.println(tarefas);
	}
	
	public int contarTarefas() {
		return tarefas.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> concluidas = new HashSet<>();
		for(Tarefa tarefa : tarefas) {
			if(tarefa.isConcluida())
				concluidas.add(tarefa);				
		}
		
		return concluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> pendentes = new HashSet<>();
		for(Tarefa tarefa : tarefas) {
			if(!tarefa.isConcluida())
				pendentes.add(tarefa);				
		}
		
		return pendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setConcluida(true);
				break;
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setConcluida(false);
				break;
			}
		}
	}
	
	public void limparListaTarefas() {
		tarefas.removeAll(tarefas);
	}
}
