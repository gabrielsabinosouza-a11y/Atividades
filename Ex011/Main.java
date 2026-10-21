public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("12345678900", "Maria");
        Cliente cli2 = new Cliente("12345678900", "Maria");

        System.out.println("cli1 == cli2      -> " + (cli1 == cli2));
        System.out.println("cli1.equals(cli2) -> " + cli1.equals(cli2));

        // Explicação: a classe Cliente não sobrescreve equals(), então é usada a
        // implementação herdada de Object, que apenas compara referências
        // (equivale a ==). cli1 e cli2 são dois objetos distintos no heap, mesmo
        // com dados idênticos; por isso equals() retorna false.
    }
}
