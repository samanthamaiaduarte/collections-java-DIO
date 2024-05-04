package list.operacoesbasicas.listatarefas;

public class UsarListaTarefa {

	public static void main(String[] args) {
		ListaTarefa tarefas = new ListaTarefa();
		
		System.out.println("O número total de tarefas na lista é: " + tarefas.obterNumeroTotalTarefas());
		
		tarefas.adicionarTarefa("Nova tarefa 1");
		tarefas.adicionarTarefa("Nova tarefa 1");
		tarefas.adicionarTarefa("Nova tarefa 2");

		System.out.println("O número total de tarefas na lista é: " + tarefas.obterNumeroTotalTarefas());
		
		tarefas.removerTarefa("Nova tarefa 1");		
		System.out.println("O número total de tarefas na lista é: " + tarefas.obterNumeroTotalTarefas());
		
		tarefas.adicionarTarefa("Nova tarefa 3");
		tarefas.adicionarTarefa("Nova tarefa 4");
		System.out.println("O número total de tarefas na lista é: " + tarefas.obterNumeroTotalTarefas());
		
		tarefas.obterDescricaoTarefas();
	}

}
