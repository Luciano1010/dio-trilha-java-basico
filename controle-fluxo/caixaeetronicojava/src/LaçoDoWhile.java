import java.util.Random;

public class LaçoDoWhile {
    public static void main(String[] args) {
        /*
         * dowhile - faça enquanto
         * ele executa pelo menos 1 vez e só depois ele verifica se a condição é
         * verdadeira, senão for ele para a aplicação.
         * 
         */

        System.out.println("Discando...");

        do {
            // excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        } while (tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return !atendeu;
    }

}
