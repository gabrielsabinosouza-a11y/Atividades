import java.util.Arrays;

public class Main {

    // Cópia profunda: cria um novo array E novos objetos Estudante
    public static Estudante[] clonarTurma(Estudante[] original) {
        Estudante[] copia = new Estudante[original.length];
        for (int i = 0; i < original.length; i++) {
            if (original[i] != null) {
                copia[i] = new Estudante(original[i].getNome(), original[i].getNota());
            }
        }
        return copia;
    }

    public static void main(String[] args) {
        Estudante[] turma = {
                new Estudante("Ana", 8.5),
                new Estudante("Bruno", 6.0),
                new Estudante("Carla", 9.0)
        };

        Estudante[] clone = clonarTurma(turma);

        clone[1].setNota(10.0);

        System.out.println("Original: " + Arrays.toString(turma));
        System.out.println("Clone:    " + Arrays.toString(clone));
        System.out.println("Bruno no original continua com 6.0? " + (turma[1].getNota() == 6.0));

        // Para comparar: cópia superficial (rasa) compartilha os mesmos objetos
        Estudante[] rasa = turma.clone();
        rasa[0].setNota(0.0);
        System.out.println("\nApós alterar via cópia superficial:");
        System.out.println("Original: " + Arrays.toString(turma));
    }
}
