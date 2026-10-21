import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Interestelar", 2014, 8.7));
        filmes.add(new Filme("Matrix", 1999, 8.7));
        filmes.add(new Filme("Cidade de Deus", 2002, 8.6));
        filmes.add(new Filme("Tropa de Elite", 2007, 8.0));
        filmes.add(new Filme("O Auto da Compadecida", 2000, 8.8));

        System.out.println("Antes de ordenar:");
        filmes.forEach(System.out::println);

        Collections.sort(filmes);

        System.out.println("\nOrdenados por nota (decrescente):");
        filmes.forEach(System.out::println);
    }
}
