package Questão12;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        System.out.println("Departamento: " + this.nome);
        System.out.println("Funcionários:");
        for (Funcionario func : funcionarios) {
            System.out.println("- " + func.getNome() + " (" + func.getCargo() + ")");
        }
    }
}
