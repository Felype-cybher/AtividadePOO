package Questão13;
import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Comodo> comodos;

    public Casa() {
        this.comodos = new ArrayList<>();
    }

    public void adicionaComodo(String nome) {
        this.comodos.add(new Comodo(nome));
    }

    public void listarComodos() {
        System.out.println("Cômodos da casa:");
        for (Comodo comodo : comodos) {
            System.out.println("- " + comodo);
        }
    }
}
