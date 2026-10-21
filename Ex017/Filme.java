public class Filme implements Comparable<Filme> {
    private String titulo;
    private int ano;
    private double nota;

    public Filme(String titulo, int ano, double nota) {
        this.titulo = titulo;
        this.ano = ano;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public int compareTo(Filme outro) {
        return Double.compare(outro.nota, this.nota);
    }

    @Override
    public String toString() {
        return titulo + " (" + ano + ") - nota " + nota;
    }
}
