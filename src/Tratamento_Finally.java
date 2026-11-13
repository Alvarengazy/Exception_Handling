public class Tratamento_Finally {
public static void main(String[] args) {
    try {
        System.out.println("Boca");

        int numero = 5/0; System.out.println("Braço");
    } catch (ArithmeticException e) {
        System.out.println("Perna");
    }finally{
         System.out.println("Pé");
    }
}
}
