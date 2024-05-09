package set.operacoesbasicas.conjuntoconvidados;

public class UsarConjuntoConvidado {

	public static void main(String[] args) {
		ConjuntoConvidado convidados = new ConjuntoConvidado();
		
		convidados.adicionarConvidado("Maria", 1234);
		convidados.adicionarConvidado("Alex", 2345);
		convidados.adicionarConvidado("Bob", 3456);
		convidados.adicionarConvidado("Anna", 4567);
		convidados.adicionarConvidado("John", 5678);
		convidados.adicionarConvidado("Joey", 5678);
		
		convidados.exibirConvidados();
		System.out.println("Existem " + convidados.contarConvidados() + " convidados na lista");
		
		convidados.removerConvidadoPorCodigoConvite(3456);
		convidados.exibirConvidados();
		System.out.println("Existem " + convidados.contarConvidados() + " convidados na lista");
	}

}
