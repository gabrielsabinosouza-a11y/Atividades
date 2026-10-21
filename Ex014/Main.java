import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(new Tarefa(1, "Estudar Java"));
        tarefas.add(new Tarefa(2, "Fazer exercícios"));   // índice 1 (id 2)
        tarefas.add(new Tarefa(3, "Revisar equals"));
        tarefas.add(new Tarefa(4, "Subir no GitHub"));
        tarefas.add(new Tarefa(2, "Fazer exercícios (duplicada)")); // índice 4 (id 2)

        Tarefa busca = new Tarefa(2, "qualquer descrição");

        System.out.println("Primeira ocorrência (indexOf):     " + tarefas.indexOf(busca));
        System.out.println("Última ocorrência (lastIndexOf):   " + tarefas.lastIndexOf(busca));
    }
}
