public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("12345678900", "Maria");
        Cliente cli2 = new Cliente("12345678900", "Maria");

        System.out.println("cli1 == cli2      -> " + (cli1 == cli2));       // false: objetos diferentes
        System.out.println("cli1.equals(cli2) -> " + cli1.equals(cli2));    // true: mesmo CPF
    }
}
