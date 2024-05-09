## Operações Básicas com Map

Aula sobre Collections em Java, do curso Java Backend Santander 2024, pela DIO. 
Neste tópico, abordando o item `Map`.

#### Proposta

Crie uma classe chamada `AgendaEventos` que utilize um `Map` para armazenar as datas e seus respectivos Eventos.
Cada evento é representado por um objeto da classe `Evento`, que possui como atributos nome do evento e o nome da atração.

Implemente os seguintes métodos:
- `adicionarEvento(LocalDate data, String nome, String atracao)`: Adiciona um evento à agenda.
- `exibirAgenda()`: Exibe a agenda de eventos em ordem crescente de data.
- `obterProximoEvento()`: Retorna o próximo evento que ocorrerá.

Em adição a proposta, para exibir o funcionamento do projeto, foi criada uma classe `UsarAgendaEventos`. 