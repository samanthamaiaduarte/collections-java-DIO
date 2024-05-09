package set.pesquisa.agendacontato;

public class UsarAgendaContato {

	public static void main(String[] args) {
		AgendaContato contatos = new AgendaContato();
		
		contatos.adicionarContato("Maria", 999545654);
		contatos.adicionarContato("Alex", 999545653);
		contatos.adicionarContato("Bob", 999545652);
		contatos.adicionarContato("Anna", 999545651);
		contatos.adicionarContato("John", 999545650);
		contatos.adicionarContato("Maria Clara", 999545655);
		contatos.adicionarContato("Anna Maria", 999545656);
		contatos.adicionarContato("John Jr", 999545657);
		contatos.adicionarContato("Maria", 999545658);
		
		contatos.exibirContatos();
		
		System.out.println("Dados de contato 'Maria':");
		System.out.println(contatos.pesquisarPorNome("Maria"));
		
		System.out.println("Atualizando Alex:");
		System.out.println(contatos.pesquisarPorNome("Alex"));
		System.out.println(contatos.atualizarNumeroContato("Alex", 999545699));
	}

}
