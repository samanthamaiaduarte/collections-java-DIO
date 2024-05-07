package list.pesquisa.somanumero;

public class UsarSomaNumero {

	public static void main(String[] args) {
		SomaNumero numeros = new SomaNumero();
		
		numeros.adicionarNumero(2);
		numeros.adicionarNumero(5);
		numeros.adicionarNumero(7);
		numeros.adicionarNumero(3);
		numeros.adicionarNumero(-2);
		numeros.adicionarNumero(0);
		numeros.adicionarNumero(-9);
		numeros.adicionarNumero(1);
		numeros.adicionarNumero(10);
		numeros.adicionarNumero(18);
		
		numeros.exibirNumeros();
		
		System.out.println("A soma dos números da lista é: " + numeros.calcularSoma());
		System.out.println("O maior número da lista é: " + numeros.encontrarMaiorNumero());
		System.out.println("O menor número da lista é: " + numeros.encontrarMenorNumero());
	}

}
