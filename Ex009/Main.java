public class Main {
    public static void main(String[] args) {
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Olá, generics!");

        Caixa<Double> caixaValor = new Caixa<>();
        caixaValor.guardar(199.90);


        String texto = caixaTexto.retirar();
        Double valor = caixaValor.retirar();

        System.out.println("Texto: " + texto);
        System.out.println("Valor: R$ " + valor);

        // Segurança de tipos em tempo de compilação:
        // As linhas abaixo NÃO compilam. Descomente uma delas para ver o erro:
        //
        // caixaTexto.guardar(42);       // erro: int não pode ser convertido para String
        // caixaValor.guardar("cem");    // erro: String não pode ser convertida para Double
        // Integer x = caixaTexto.retirar(); // erro: String não pode virar Integer
        //
        // Sem generics (usando Object), esses erros só apareceriam em tempo de
        // execução, como ClassCastException.
    }
}
