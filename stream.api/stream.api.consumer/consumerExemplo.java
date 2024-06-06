import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerExemplo {
    public static void main(String[] args) {

        // criar uma lista de inteiros

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar o consumer para imprimir os numeros pares

        /*
         * Consumer<Integer> imprimirNumerosPares = numero -> {
         * if(numero % 2 == 0){
         * System.out.print(numero + " ");
         * }
         * };
         */

        numeros.stream().filter(n -> n % 2 == 0)
            .forEach(System.out :: print);
        
        numeros.stream().filter(n -> n % 2 != 0)
            .forEach(System.out :: print);

        
    }
}
