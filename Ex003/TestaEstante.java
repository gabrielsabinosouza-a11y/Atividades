public class TestaEstante {
    public static void main(String[] args) {
        Livro[] estante = new Livro[5];

        estante[0] = new Livro("Dom Casmurro", 256);
        estante[2] = new Livro("O Cortiço", 208);
        estante[4] = new Livro("Memórias Póstumas de Brás Cubas", 240);
        // índices 1 e 3 permanecem null

        for (int i = 0; i < estante.length; i++) {
            if (estante[i] != null) {
                System.out.println("Título: " + estante[i].getTitulo()
                        + " | Páginas: " + estante[i].getPaginas());
            } else {
                System.out.println("Posição " + i + " está vazia.");
            }
        }
    }
}
