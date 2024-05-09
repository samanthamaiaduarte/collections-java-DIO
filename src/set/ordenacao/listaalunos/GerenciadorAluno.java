package set.ordenacao.listaalunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
	Set<Aluno> alunos;
	
	public GerenciadorAluno() {
		alunos = new HashSet<>();
	}
	
	public void adicionarAluno(Long matricula, String nome, double media) {
		alunos.add(new Aluno(matricula, nome, media));
	}
	
	public void removerAluno(Long matricula) {
		for(Aluno aluno : alunos) {
			if(aluno.getMatricula().equals(matricula)) {
				alunos.remove(aluno);
				break;
			}
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunosNome = new TreeSet<>(alunos);
		return alunosNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> alunosMedia = new TreeSet<>(new Aluno());
		alunosMedia.addAll(alunos);
		
		return alunosMedia;
	}
	
	public void exibirAlunos() {
		System.out.println(alunos);
	}
}
