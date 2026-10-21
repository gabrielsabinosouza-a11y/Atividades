import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(8.5);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(6.9);
        notas.add(9.5);
        notas.add(4.0);
        notas.add(7.5);
        notas.add(3.2);

        System.out.println("Notas originais: " + notas);

        // Remove todas as notas estritamente menores que 7.0
        notas.removeIf(nota -> nota < 7.0);

        System.out.println("Notas dos aprovados: " + notas);
        System.out.println("Total de aprovados: " + notas.size());
    }
}
