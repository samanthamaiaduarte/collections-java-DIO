package set.ordenacao.listaalunos;

public class UsarListaAlunos {
	public static void main(String[] args) {
		GerenciadorAluno alunos = new GerenciadorAluno();
		
		alunos.adicionarAluno(1001L, "Maria", 9.5);
		alunos.adicionarAluno(1002L, "Anna", 7.5);
		alunos.adicionarAluno(1003L, "Alex", 9.0);
		alunos.adicionarAluno(1004L, "Bob", 8.5);
		alunos.adicionarAluno(1005L, "Bia", 10.0);
		alunos.adicionarAluno(1006L, "Leo", 6.5);
		
		alunos.exibirAlunos();
		
		System.out.println();
		System.out.println("Remover aluno Bob");
		alunos.removerAluno(1004L);
		alunos.exibirAlunos();
		
		System.out.println();
		System.out.println("Alunos ordenador por nome:");
		System.out.println(alunos.exibirAlunosPorNome());
		
		System.out.println();
		System.out.println("Alunos ordenados por nota:");
		System.out.println(alunos.exibirAlunosPorNota());
		
	}
}
