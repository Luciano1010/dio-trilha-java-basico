package generics;
import java.util.HashMap;
import java.util.Map;

public class GenericMap {
    
    public static void main(String[] args) {
        
        Map mapaSemGeneric = new HashMap();
        mapaSemGeneric.put("Chave 1", "João");
        mapaSemGeneric.put("Chave 2", "Valor");

        Map<String, Integer> mapaComGeneric = new HashMap<>();
        mapaComGeneric.put("Chave-Luciano", 1);
        mapaComGeneric.put("Chave-Ivone", 2);

        for (Map.Entry<String, Integer> entry : mapaComGeneric.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();

            System.out.println("Chave = " + chave +" = "+ valor);
        }

        for (Object obj : mapaSemGeneric.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave= " + chave + "Valor= " + valor);

        }
        
    }
}
