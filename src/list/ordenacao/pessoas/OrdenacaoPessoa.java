package list.ordenacao.pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoas;
	
	public OrdenacaoPessoa() {
		this.pessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, Integer idade, Double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasOrdenada = new ArrayList<>(pessoas);
		
		if(!pessoasOrdenada.isEmpty()) {
			Collections.sort(pessoasOrdenada);
			return pessoasOrdenada;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
		
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasOrdenada = new ArrayList<>(pessoas);
		
		if(!pessoasOrdenada.isEmpty()) {
			Collections.sort(pessoasOrdenada, new ComparatorPorAltura());
			return pessoasOrdenada;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}
}
