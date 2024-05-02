package edu.luciano.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Luciano";
        String nomeDois = "Luciano";
        // quando se trata de objetos usamos o metodo equals ele compara conteudos ele compara se os conteudos dos dois objetos são iguais
        System.out.println(nomeUm.equals(nomeDois));

        int i1 = 10;
        int i2 = 20;

        boolean simNao = i1 == i2;
        System.out.println("o i1 é igual i2? " + simNao);

        simNao = i1 != i2;
        System.out.println("o i1 é diferente i2? " + simNao);

        simNao = i1 > i2;
        System.out.println("o i1 é maior i2? " + simNao);

        simNao = i1 < i2;
        System.out.println("o i1 é menor i2? " + simNao);



    }
}
