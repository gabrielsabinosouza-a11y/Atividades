import java.util.ArrayList;

public class Main {

    public static Funcionario buscarPorMatricula(ArrayList<Funcionario> lista, int matricula) {
        for (Funcionario f : lista) {
            if (f.getMatricula() == matricula) {
                return f; // devolve a referência do próprio objeto da lista
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario(101, "Ana", 3000.00));
        funcionarios.add(new Funcionario(102, "Bruno", 3500.00));
        funcionarios.add(new Funcionario(103, "Carla", 4000.00));
        funcionarios.add(new Funcionario(104, "Diego", 2800.00));

        Funcionario encontrado = buscarPorMatricula(funcionarios, 102);

        if (encontrado != null) {
            System.out.println("Antes:  " + encontrado);
            encontrado.setSalario(encontrado.getSalario() * 1.10);
            System.out.println("Depois: " + encontrado);
        }

        // Como a função devolveu a referência, o reajuste vale para o objeto dentro da lista
        System.out.println("\nNa lista: " + funcionarios.get(1));

        System.out.println("\nMatrícula inexistente (999): " + buscarPorMatricula(funcionarios, 999));
    }
}
