public class Tratamento_personalizado {

    public static class QuantidadeInvalidaException extends Exception {

        public QuantidadeInvalidaException(String mensagem) {super(mensagem);}
    }

    public static class Estoque {

        public static void verificarQuantidade(int quantidade)throws QuantidadeInvalidaException {

            if (quantidade < 0) {
                throw new QuantidadeInvalidaException("Quantidade não pode ser negativa!");}

            System.out.println("Quantidade válida!");
        }

        public static void main(String[] args) {
            try {
                verificarQuantidade(-5);
            } catch (QuantidadeInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}