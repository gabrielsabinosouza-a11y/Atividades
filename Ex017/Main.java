import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Interestelar", 2014, 8.7));
        filmes.add(new Filme("Matrix", 1999, 8.7));
        filmes.add(new Filme("Cidade de Deus", 2002, 8.6));
        filmes.add(new Filme("Tropa de Elite", 2007, 8.0));
        filmes.add(new Filme("O Auto da Compadecida", 2000, 8.8));


        filmes.sort(Comparator.comparing(Filme::getTitulo));
        System.out.println("Por título (A-Z):");
        filmes.forEach(System.out::println);

        filmes.sort((f2, f2) -> Integer.compare(f1.getAno(), f2.getAno()));
        System.out.println("\nPor ano (crescente):");
        filmes.forEach(System.out::println);
    }
}
