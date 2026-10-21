public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem(new ItemPedido(1, "Teclado", 150.00, 1));
        pedido.adicionarItem(new ItemPedido(2, "Mouse", 80.00, 2));
        pedido.adicionarItem(new ItemPedido(3, "Monitor", 900.00, 1));
        pedido.adicionarItem(new ItemPedido(4, "Cabo HDMI", 25.00, 3));

        // Código repetido: não cria novo item, soma a quantidade ao existente
        pedido.adicionarItem(new ItemPedido(2, "Mouse", 80.00, 3)); // Mouse passa a ter 5

        System.out.println("Pedido inicial:");
        pedido.exibirResumoOrdenado();

        boolean removido = pedido.removerItem(4);
        System.out.println("\nRemoveu o item 4 (Cabo HDMI)? " + removido);
        System.out.println("Removeu o item 99 (inexistente)? " + pedido.removerItem(99));

        System.out.println("\nPedido final:");
        pedido.exibirResumoOrdenado();
    }
}
