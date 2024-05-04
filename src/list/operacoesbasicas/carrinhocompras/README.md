## Operações Básicas com List

Aula sobre Collections em Java, do curso Java Backend Santander 2024, pela DIO. 
Neste tópico, abordando o item `List`.

#### Proposta

Crie uma classe chamada `CarrinhoDeCompras` que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens.
Cada item é representado por uma classe chamada `Item` que possui atributos nome, preço e quantidade.

Implemente os seguintes métodos:
- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
- `removerItem(String nome)`: Remove um item do carrinho com base no seu nome.
- `calcularValorTotal()`: Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
- `exibirItens()`: Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.

Em adição a proposta, para exibir o funcionamento do projeto, foi criada uma classe `UsarCarrinhoCompra`. 