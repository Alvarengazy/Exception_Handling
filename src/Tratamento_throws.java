public class Tratamento_throws {
    
 public static void validarIdade(int idade)
            throws IllegalArgumentException {

        if (idade < 18) {
            throw new IllegalArgumentException("Idade insuficiente!");
        }

        System.out.println("Idade permitida!");
    }

    public static void main(String[] args) {

        validarIdade(20);
        }
    }