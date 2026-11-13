public class Tratatamento_throw {
public static void main(String[] args) {
    
    int numero = 9;

    if (numero <= 15) {
        throw new IllegalArgumentException("O número deve ser maior que 15!");
    }
}
}
