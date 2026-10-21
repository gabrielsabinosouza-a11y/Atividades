import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido novoItem) {
        int pos = itens.indexOf(novoItem); // usa equals() -> compara pelo código
        if (pos >= 0) {
            ItemPedido existente = itens.get(pos);
            existente.setQuantidade(existente.getQuantidade() + novoItem.getQuantidade());
        } else {
            itens.add(novoItem);
        }
    }

    public boolean removerItem(int codigo) {
        // Cria um item "de busca" apenas com o código, aproveitando o equals()
        ItemPedido busca = new ItemPedido(codigo, "", 0.0, 0);
        return itens.remove(busca);
    }

    public double calcularTotalPedido() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void exibirResumoOrdenado() {
        // Cópia ordenada: não altera a ordem de inserção da lista original
        List<ItemPedido> ordenados = new ArrayList<>(itens);
        ordenados.sort(Comparator.comparingDouble(ItemPedido::getSubtotal).reversed());

        System.out.println("===== RESUMO DO PEDIDO (maior para menor subtotal) =====");
        for (ItemPedido item : ordenados) {
            System.out.printf("Cód %-3d | %-12s | R$ %8.2f x %2d = R$ %9.2f%n",
                    item.getCodigo(), item.getNome(), item.getPrecoUnitario(),
                    item.getQuantidade(), item.getSubtotal());
        }
        System.out.println("---------------------------------------------------------");
        System.out.printf("TOTAL DO PEDIDO: R$ %.2f%n", calcularTotalPedido());
    }
}
