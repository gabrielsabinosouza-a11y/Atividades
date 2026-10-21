import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] marcasArray = {"Ford", "Toyota", "Honda"};

        // Arrays.asList sozinho devolve uma lista de tamanho FIXO (add() lançaria
        // UnsupportedOperationException). Envolver em new ArrayList<>() cria uma
        // lista dinâmica e editável.
        List<String> listaMarcas = new ArrayList<>(Arrays.asList(marcasArray));

        listaMarcas.add("Chevrolet");
        listaMarcas.add("Volkswagen");

        String[] arrayFinal = listaMarcas.toArray(new String[0]);

        for (String marca : arrayFinal) {
            System.out.println(marca);
        }
    }
}
