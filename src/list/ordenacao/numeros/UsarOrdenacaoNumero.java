package list.ordenacao.numeros;

public class UsarOrdenacaoNumero {

	public static void main(String[] args) {
		OrdenacaoNumero numeros = new OrdenacaoNumero();
		
		numeros.adicionarNumero(5);
		numeros.adicionarNumero(2);
		numeros.adicionarNumero(18);
		numeros.adicionarNumero(27);
		numeros.adicionarNumero(32);
		numeros.adicionarNumero(40);
		numeros.adicionarNumero(15);
		numeros.adicionarNumero(20);
		numeros.adicionarNumero(85);
		numeros.adicionarNumero(7);
		
		System.out.println("Lista ordenada Asc");
		System.out.println(numeros.ordenarAscendente());
		System.out.println("Lista ordenada Desc");
		System.out.println(numeros.ordenarDescendente());
	}

}
