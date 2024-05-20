package generics;
import java.util.HashSet;
import java.util.Set;

public class GenericSet {
    public static void main(String[] args) {
        // exemplo sem generics
        Set conjuntosemGenerics = new HashSet();
        conjuntosemGenerics.add("Elemento 1");
        conjuntosemGenerics.add(10);

        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 2 com Generics");
        conjuntoGenerics.add("Elemento 3 com Generics");

        for(String elemento : conjuntoGenerics){
            System.out.println(elemento);
        }

        for(Object elemento : conjuntosemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }


    }
}
