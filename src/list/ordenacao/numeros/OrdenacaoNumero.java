package list.ordenacao.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
	List<Integer> numeros;
	
	public OrdenacaoNumero() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente(){
		List<Integer> numerosAsc = new ArrayList<>(numeros);
		
		if(!numerosAsc.isEmpty()) {
			Collections.sort(numerosAsc);
			return numerosAsc;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> numerosDesc = new ArrayList<>(numeros);
		
		if(!numerosDesc.isEmpty()) {
			numerosDesc.sort(Collections.reverseOrder());
			return numerosDesc;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}
	
}
