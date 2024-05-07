package list.pesquisa.catalogolivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

	List<Livro> livros;

	public CatalogoLivro() {
		this.livros = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livros.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPesquisa = new ArrayList<>();
		
		if (!livros.isEmpty()) {
			for(Livro livro : livros) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPesquisa.add(livro);
				}
			}
		}
		
		return livrosPesquisa;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPesquisa = new ArrayList<>();
		
		if (!livros.isEmpty()) {
			for(Livro livro : livros) {
				if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livrosPesquisa.add(livro);
				}
			}
		}
		
		return livrosPesquisa;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPesquisa = null;
		
		if (!livros.isEmpty()) {
			for(Livro livro : livros) {
				if(livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPesquisa = livro;
					break;
				}
			}
		}
		
		return livroPesquisa;
	}
}
