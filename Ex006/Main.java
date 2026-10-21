import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Produto> filtrarPorPrecoMaximo(List<Produto> produtos, double precoMaximo) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getPreco() <= precoMaximo) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Caneta", 3.50));
        produtos.add(new Produto(2, "Caderno", 18.90));
        produtos.add(new Produto(3, "Mochila", 120.00));
        produtos.add(new Produto(4, "Lápis", 2.00));
        produtos.add(new Produto(5, "Calculadora", 45.00));

        List<Produto> baratos = filtrarPorPrecoMaximo(produtos, 20.0);

        System.out.println("Produtos com preço até R$ 20,00:");
        for (Produto p : baratos) {
            System.out.println(p);
        }
    }
}
