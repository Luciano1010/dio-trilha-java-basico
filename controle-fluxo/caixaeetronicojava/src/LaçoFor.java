import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LaçoFor {
    public static void main(String[] args) {

        /*
         * for(bloco de inicilização; expresão booleana; bloco de atualizção){
         * o comando for só vai parar quando a expressão boolena se tornar falsa
         * }
         * o comando Break - ele interropem a interação
         * o comando continue - o nome ja diz ele continua a interaçao
         */

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinho" + carneirinhos);
        }

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // o x representa o indicde do array alunos
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        // laço for each - modo simplificado
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break; // onde eu posso parar a interação por meio de uma condicional
                       // se fosse a palavra continue a laço vai ate o seu final
            // System.out.println(numero);
        }

        // Ordenando por numero pares e impares
        int ordenacao[] = { 1, 2, 4, 3, 5, 6, 8, 7, 9, 10 };

        Arrays.sort(ordenacao);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int numeros : ordenacao) {
            if (numeros % 2 == 0) {
                pares.add(numeros);

            } else {
                impares.add(numeros);
            }
        }

        System.out.println(" Numero Pares");
        for (int par : pares) {
            System.out.print(" " + par);
        }

        System.out.println(" Numero Impar");
        for (int impar : impares) {
            System.out.print(" " + impar);
        }

        // Ordenaçao por inserçao
        /*
         * int ordenacaoInsercao[] = {5,1,2,3,8,6,4,7,10,9};
         * 
         * for(int i = 0; i < ordenacaoInsercao.length; i ++){
         * 
         * for(int j = i; j >= 1 && ordenacaoInsercao[j] < ordenacaoInsercao[j - 1];
         * j--){
         * int temp = ordenacaoInsercao[j];
         * ordenacaoInsercao[j] = ordenacaoInsercao[j - 1];
         * ordenacaoInsercao[j - 1] = temp;
         * }
         * }
         * 
         * System.out.println("Numeros Ordenados por Inserção");
         * for(int numerosOrdenados : ordenacaoInsercao){
         * System.out.print(numerosOrdenados + " ");
         * }
         */

        List <Integer> lista = Arrays.asList(1,1,2,3,4,4,6,4,7,10,10,10);

        List<Integer> result = new ArrayList<>();
        int [] count = new int [12];
        
        // percorrer a lista e incrementar os indice ao array vazio count
        for(int i = 0; i < lista.size(); i++){
            count[lista.get(i)]++; // pega o valor da lista e envia pro valor correspondente de count
        }
        
        /*
         * aqui estou percorrendo count pelo indice no externo e no interno eu to pegando os valores e adicionando na result list
         */

        for(int i = 0; i < 12; i ++){
            for(int j = 0; j < count[i]; j++){
                result.add(i); 
            }
        }
            System.out.print(result);
       }
    }


    List<Integer> arr = Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854);
    
    int arrayInt = arr.size();
    
        
    int menorDiferenca = Integer.MAX_VALUE;
    
    List<Integer> result = new ArrayList<>();
  
    for(int i = 0; i < arr.size() - 1; i++){
       int diferenca = Math.abs(arr.get(i) - arr.get(i + 1)); 
       if(diferenca < menorDiferenca){
           menorDiferenca = diferenca;
           result.clear();
           result.add(arr.get(i));
           result.add(arr.get(i + 1));
       } else if (diferenca == menorDiferenca) {
            result.add(arr.get(i));
            result.add(arr.get(i + 1));
        }
    }
    
    return result;
}


