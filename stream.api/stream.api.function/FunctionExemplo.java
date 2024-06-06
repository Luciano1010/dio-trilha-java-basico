import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDrobrados = numeros.stream()
            .map(n -> n * 2)
            .collect(Collectors.toList());

        numerosDrobrados.forEach(n -> System.out.print(n + " "));
    }
}
