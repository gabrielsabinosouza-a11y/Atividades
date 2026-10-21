public class TestaAliasing {
    public static void main(String[] args) {
        Carro[] garagem = new Carro[3];
        garagem[0] = new Carro("Toyota", "Corolla", 2020);
        garagem[1] = new Carro("Honda", "Civic", 2018);
        garagem[2] = new Carro("Ford", "Ka", 2015);

        Carro meuCarro = garagem[0];
        meuCarro.setAno(2025);

        System.out.println(garagem[0].getAno()); // imprime 2025

        // Explicação: garagem[0] e meuCarro NÃO guardam cópias do carro, e sim a
        // mesma referência (o mesmo endereço) para um único objeto no heap.
        // Ao chamar setAno() por meio de meuCarro, alteramos esse objeto único;
        // por isso, ao ler o ano via garagem[0], vemos o valor já modificado.
        // Isso é o aliasing: dois nomes diferentes apontando para o mesmo objeto.
    }
}
