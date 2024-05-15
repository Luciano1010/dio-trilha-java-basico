import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class LaçoWhile {
    public static void main(String[] args) { 
        
        /*
         * while(expressão booleana de validaçao)
         * {
         *      comando sera executado  ate quando a expressão boolena se tornar falsa
         * 
         * }
         * 
         */

         double mesada = 50.0;

         while (mesada > 0) {

            double valorDoce = valorAleatorio();

            if(valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Doce do Valor" + valorDoce + "Adicionado ao carrinho");
            mesada = mesada - valorDoce;
            System.out.println("Mesada:" + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");
         }

         int tentativas = 5;
         int numeroAlvo = 6;
         Random random = new Random();
 
         while(tentativas > 0){
         int resultado = random.nextInt(7) + 1;
         System.out.println("Voce lançou o dardo e obteve " + resultado);
 
         if(resultado == numeroAlvo ){
             System.out.println("Voce acertou o numero alvo");
             break;
         }
         else{
             System.out.println("Voce errou tente novamente...");
             tentativas --;
             System.out.println("Numero de tentaivas " + tentativas);
         }
     }
    }

        private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
        }

    }
 


