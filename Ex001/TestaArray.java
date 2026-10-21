public class TestaArray {
    public static void main(String[] args) {
        // Array de referências: cada posição guarda a referência de um objeto Carro
        // (no início, todas as posições valem null)
        Carro[] garagem = new Carro[3];

        garagem[0] = new Carro("Toyota", "Corolla", 2020);
        garagem[1] = new Carro("Honda", "Civic", 2018);
        garagem[2] = new Carro("Ford", "Ka", 2015);

        for (Carro carro : garagem) {
            System.out.println("Marca: " + carro.getMarca()
                    + " | Modelo: " + carro.getModelo()
                    + " | Ano: " + carro.getAno());
        }
    }
}
