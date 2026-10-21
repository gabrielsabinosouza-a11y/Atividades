import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int n = 10; n <= 100; n += 10) {
            numeros.add(n);
        }
        System.out.println("Original:  " + numeros);


        List<Integer> sub = numeros.subList(2, 6);
        System.out.println("Sublista:  " + sub);

        sub.set(0, 999);

        System.out.println("\nApós sub.set(0, 999):");
        System.out.println("Sublista:  " + sub);
        System.out.println("Original:  " + numeros);

    }
}
