import java.util.Locale;
import java.util.Scanner;



public class TratamentoExcecoes {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite seu nome:");
        String nome = scanner.next();
        
        System.out.print("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.print("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();  
        }catch(java.util.InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numericos");
        }
    }
}
