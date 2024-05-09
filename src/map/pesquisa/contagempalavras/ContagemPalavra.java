package map.pesquisa.contagempalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
	private Map<String, Integer> contador;
	
	public ContagemPalavra() {
		contador = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		contador.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		contador.remove(palavra);
	}
	
	public void exibirContagemPalavras() {
		System.out.println(contador);
	}
	
	public String encontrarPalavraMaisFrequente() {
		String maisFrequente = null;
		int maior = 0;
		
		for(String key : contador.keySet()) {
			if(maior == 0 || maior < contador.get(key)) {
				maisFrequente = key;
				maior = contador.get(key);
			}
		}
		
		return maisFrequente;
	}
}
