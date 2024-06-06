package generics;

import java.util.List;
import java.util.ArrayList;

public class GenericList {
    public static void main(String[] args) {
        // sem generics
        List listaSemGenerics = new ArrayList();

        // listaSemGenerics.add("Ana");
        // listaSemGenerics.add(10);

        // com generics

        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Ivone");
        listaGenerics.add("Luciano");

        // iterando sobre lista com generics
        for (String nome : listaGenerics) {
            System.out.println(nome);
        }
        // iterando sobre a lista sem generics eu preciso fazer o cast
        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
