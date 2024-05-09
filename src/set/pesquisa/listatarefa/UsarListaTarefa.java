package set.pesquisa.listatarefa;

public class UsarListaTarefa {
	public static void main(String[] args) {
		ListaTarefa tarefas = new ListaTarefa();
		
		tarefas.adicionarTarefa("Tarefa 1");		
		tarefas.adicionarTarefa("Tarefa 2");		
		tarefas.adicionarTarefa("Tarefa 3");		
		tarefas.adicionarTarefa("Tarefa 4");		
		tarefas.adicionarTarefa("Tarefa 5");		
		tarefas.adicionarTarefa("Tarefa 6");		
		tarefas.adicionarTarefa("Tarefa 7");		
		tarefas.adicionarTarefa("Tarefa 8");		
		tarefas.adicionarTarefa("Tarefa 9");		
		tarefas.adicionarTarefa("Tarefa 9");
		
		tarefas.exibirTarefas();
		System.out.println("Existe "+tarefas.contarTarefas()+" tarefas na lista");
		
		tarefas.removerTarefa("Tarefa 9");
		tarefas.exibirTarefas();
		System.out.println("Existe "+tarefas.contarTarefas()+" tarefas na lista");
		
		tarefas.marcarTarefaConcluida("Tarefa 2");
		tarefas.marcarTarefaConcluida("Tarefa 5");
		tarefas.marcarTarefaConcluida("Tarefa 8");
		
		System.out.println("Lista de tarefas concluídas:");
		System.out.println(tarefas.obterTarefasConcluidas());
		System.out.println("Lista de tarefas pendentes:");
		System.out.println(tarefas.obterTarefasPendentes());
		
		System.out.println();
		System.out.println("Limpando a lista de tarefas....");
		tarefas.limparListaTarefas();
		System.out.println("Existe "+tarefas.contarTarefas()+" tarefas na lista");
	}
}
