package list.pesquisa.catalogolivros;

public class UsarCatalogoLivro {

	public static void main(String[] args) {
		CatalogoLivro livros = new CatalogoLivro();
		
		livros.adicionarLivro("Livro A", "Autor 1", 2000);
		livros.adicionarLivro("Livro A", "Autor 2", 2000);
		livros.adicionarLivro("Livro A", "Autor 3", 2000);
		livros.adicionarLivro("Livro B", "Autor 2", 1999);
		livros.adicionarLivro("Livro B", "Autor 4", 1999);
		livros.adicionarLivro("Livro C", "Autor 3", 2010);
		livros.adicionarLivro("Livro D", "Autor 5", 2005);
		livros.adicionarLivro("Livro E", "Autor 6", 2003);
		livros.adicionarLivro("Livro F", "Autor 1", 2001);
		livros.adicionarLivro("Livro F", "Autor 7", 2001);
		
		System.out.println("Livros do Autor 1");
		System.out.println(livros.pesquisarPorAutor("Autor 1"));
		
		System.out.println("Livros publicados entre 2000 e 2005");
		System.out.println(livros.pesquisarPorIntervaloAnos(2000, 2005));
		
		System.out.println("Informações do Livro F");
		System.out.println(livros.pesquisarPorTitulo("Livro F"));
	}

}
