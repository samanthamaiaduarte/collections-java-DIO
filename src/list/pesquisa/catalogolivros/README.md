## Operações Básicas com List

Aula sobre Collections em Java, do curso Java Backend Santander 2024, pela DIO. 
Neste tópico, abordando o item `List`.

#### Proposta

Crie uma classe chamada `CatalogoLivro` que possui uma lista de objetos do tipo `Livro` como atributo.
Cada livro possui os atributos título, autor e ano de publicação.

Implemente os seguintes métodos:
- `adicionarLivro(String titulo, String autor, int anoPublicacao)`: Adiciona um livro ao catálogo.
- `pesquisarPorAutor(String autor)`: Pesquisa livros por autor e retorna uma lista com os livros encontrados.
- `pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)`: Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
- `pesquisarPorTitulo(String titulo)`: Pesquisa livros por título e retorna o primeiro livro encontrado.

Em adição a proposta, para exibir o funcionamento do projeto, foi criada uma classe `UsarCatalogoLivro`. 