public class Caixa<T> {
    private T conteudo;

    public void guardar(T elemento) {
        this.conteudo = elemento;
    }

    public T retirar() {
        T temp = this.conteudo;
        this.conteudo = null;
        return temp;
    }
}
