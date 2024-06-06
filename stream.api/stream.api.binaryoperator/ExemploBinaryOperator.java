import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExemploBinaryOperator {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        final int resultado = numeros.stream()
            .reduce(0, Integer :: sum);
          // .reduce(0, (num1, num2) -> num1 + num2)
        
        System.out.print("A soma dos numeros é " + resultado);

            

    }
}
