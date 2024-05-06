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
    }

    private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
