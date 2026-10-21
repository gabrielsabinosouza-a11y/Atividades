import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente("111", "Ana"));
        lista.add(new Cliente("222", "Bruno"));
        lista.add(new Cliente("333", "Carla"));


        Cliente clienteBusca = new Cliente("222", "Outro Nome");

        System.out.println("contains: " + lista.contains(clienteBusca));
        System.out.println("indexOf:  " + lista.indexOf(clienteBusca));

        // contains() e indexOf() percorrem a lista chamando equals() em cada elemento.
        // Como equals() compara só o CPF, o cliente é encontrado (índice 1) mesmo
        // sendo outro objeto e com nome diferente. Sem o equals() sobrescrito,
        // contains() daria false e indexOf() daria -1.
    }
}
