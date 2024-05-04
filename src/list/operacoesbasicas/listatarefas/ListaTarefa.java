package list.operacoesbasicas.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List<Tarefa> tarefas;
	
	public ListaTarefa() {
		this.tarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		this.tarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		//this.tarefas.removeIf(x -> x.getDescricao() == descricao);
		
		/*
		 * Embora seja possível resolver mais simplificado com o removeIf, a proposta
		 * da tarefa era resolver com o removeAll.
		 */
		List<Tarefa> remover = new ArrayList<>();
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				remover.add(tarefa);
			}
		}
		
		this.tarefas.removeAll(remover);
	}
	
	public int obterNumeroTotalTarefas() {
		return this.tarefas.size();
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(this.tarefas);
	}
}
