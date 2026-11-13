public class Tratamento_try_catch {

public static void main(String[] args) {
    int numeros [] = {10, 20 , 30, 40};

    try {
        int resultado =  numeros[3]/0; System.out.println(resultado);
    } catch (ArithmeticException e) {
         System.out.println("Não pode ser dividido por zero!!!");
    } catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Erro posição na Array!!!");
    }
}

}
