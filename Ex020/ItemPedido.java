import java.util.Objects;

public class ItemPedido {
    private int codigo;
    private String nome;
    private double precoUnitario;
    private int quantidade;

    public ItemPedido(int codigo, String nome, double precoUnitario, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return precoUnitario * quantidade;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ItemPedido outro = (ItemPedido) obj;
        return this.codigo == outro.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
