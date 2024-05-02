package edu.luciano.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {


        boolean condicao1 = true;
        boolean condicao2 = false;

        // && só entrara no if se as duas forem verdadeiras,
        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        // || para entra no bloc de código é necessario que só uma expressão seja verdadeira
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
            
        }

        // tbm posso colocar expressões relacionais, porque tbm elas geram valores booleanos
        if(condicao1 && (7 > 4)){
            System.out.println("ambas tbm são verdade");
        }



        System.out.println("FIM");
    }
}
