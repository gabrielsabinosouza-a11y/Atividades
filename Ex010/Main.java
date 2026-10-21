import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static double calcularMedia(List<Double> valores) {
        if (valores.isEmpty()) {
            return 0.0;
        }
        double soma = 0.0;
        for (double v : valores) { // Unboxing: Double -> double a cada iteração
            soma += v;
        }
        return soma / valores.size();
    }

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();

        // Autoboxing: o literal double vira Double automaticamente
        notas.add(7.5);
        notas.add(8.0);
        notas.add(6.5);
        notas.add(9.0);
        notas.add(5.0);

        System.out.println("Notas: " + notas);
        System.out.println("Maior nota: " + Collections.max(notas));
        System.out.println("Menor nota: " + Collections.min(notas));
        System.out.println("Média: " + calcularMedia(notas));
    }
}
