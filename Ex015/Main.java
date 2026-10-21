import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tarefa> lista = new ArrayList<>();
        Tarefa t1 = new Tarefa(1, "Estudar Java");
        Tarefa t2 = new Tarefa(2, "Fazer exercícios");
        Tarefa t3 = new Tarefa(3, "Revisar equals");
        Tarefa t4 = new Tarefa(4, "Subir no GitHub");
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);

        // remove(int index): remove pela POSIÇÃO e devolve o elemento removido
        Tarefa removida = lista.remove(0);
        System.out.println("remove(0) devolveu o elemento: " + removida);
        System.out.println("Lista: " + lista);

        // remove(Object o): remove a primeira ocorrência EQUIVALENTE (usa equals)
        // e devolve boolean indicando se algo foi removido
        Tarefa equivalente = new Tarefa(3, "outra descrição, mas mesmo id");
        boolean foiRemovida = lista.remove(equivalente);
        System.out.println("\nremove(objeto) devolveu o boolean: " + foiRemovida);
        System.out.println("Lista: " + lista);

        // Diferença entre os retornos:
        //  - remove(int index)  -> retorna o ELEMENTO removido (E); lança
        //                          IndexOutOfBoundsException se o índice for inválido.
        //  - remove(Object o)   -> retorna boolean: true se encontrou e removeu,
        //                          false se não havia elemento igual (sem exceção).
        // Cuidado: em List<Integer>, remove(1) remove pelo ÍNDICE; para remover o
        // valor 1 é preciso usar remove(Integer.valueOf(1)).
    }
}
