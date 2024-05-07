package list.pesquisa.somanumero;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
	List<Integer> numeros;
	
	public SomaNumero() {
		numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		
		for(int numero : numeros) {
			soma += numero;
		}
		
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maior = 0;
		
		for(int numero : numeros) {
			if(maior == 0 || numero > maior) 
				maior = numero;
		}
		
		return maior;
	}
	
	public int encontrarMenorNumero() {
		int menor = 0;
		
		for(int numero : numeros) {
			if(menor == 0 || numero < menor) 
				menor = numero;
		}
		
		return menor;		
	}
	
	public void exibirNumeros() {
		for(int numero : numeros) {
			System.out.println(numero);
		}
	}
}
