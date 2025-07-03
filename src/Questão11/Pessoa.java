package Questão11;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        if (endereco != null) {
            System.out.println("Endereço: " + endereco.getEnderecoCompleto());
        } else {
            System.out.println("Endereço não informado.");
        }
    }
}

