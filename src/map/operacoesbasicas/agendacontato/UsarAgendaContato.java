package map.operacoesbasicas.agendacontato;

public class UsarAgendaContato {

	public static void main(String[] args) {
		AgendaContato contatos = new AgendaContato();
		
		contatos.adicionarContato("Maria", 999985459L);
		contatos.adicionarContato("Elsa", 999985450L);
		contatos.adicionarContato("John", 999985457L);
		contatos.adicionarContato("Alex", 999985455L);
		contatos.adicionarContato("Bob", 999985452L);
		contatos.adicionarContato("Anna", 999985456L);
		
		contatos.exibirContatos();
		
		System.out.println();
		System.out.println("Removendo contato 'Elsa':");
		contatos.removerContato("Elsa");
		contatos.exibirContatos();
		
		System.out.println();
		System.out.println("Telefone da 'Anna': " + contatos.pesquisarPorNome("Anna"));
	}

}
