import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class supplier {
    public static void main(String[] args) {
        Supplier<String> saudacoes = () -> "Óla, seja bem vindo";

        List<String> listaSaudacoes = Stream.generate(saudacoes)
            .limit(5)
            .collect((Collectors.toList()));


        listaSaudacoes.forEach(System.out :: println);

    }
}
