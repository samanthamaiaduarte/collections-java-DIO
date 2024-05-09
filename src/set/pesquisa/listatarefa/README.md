## Operações Básicas com Set

Aula sobre Collections em Java, do curso Java Backend Santander 2024, pela DIO. 
Neste tópico, abordando o item `Set`.

#### Proposta

Crie uma classe chamada `ListaTarefas` que possui um conjunto de objetos do tipo `Tarefa` como atributo.
Cada tarefa possui atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não.

Implemente os seguintes métodos:
- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao Set.
- `removerTarefa(String descricao)`: Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
- `exibirTarefas()`: Exibe todas as tarefas da lista de tarefas.
- `contarTarefas()`: Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas()`: Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída de acordo com a descrição.
- `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente de acordo com a descrição.
- `limparListaTarefas()`: Remove todas as tarefas da lista de tarefas.

Em adição a proposta, para exibir o funcionamento do projeto, foi criada uma classe `UsarListaTarefa`. 