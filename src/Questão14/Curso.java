package Questão14;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Curso: " + this.nome);
        System.out.println("Alunos Matriculados:");
        for (Aluno a : alunos) {
            System.out.println("- " + a.getNome() + " (Matrícula: " + a.getMatricula() + ")");
        }
    }
}