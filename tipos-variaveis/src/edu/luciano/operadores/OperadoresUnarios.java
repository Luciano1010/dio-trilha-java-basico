package edu.luciano.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        // Unários

        //(+) - operador unário de valor positivo, (-) uário de valor negativo - ele nega um numero ou expressão aritimetica

        //(++) Operador unário que incrementa valor - incrementa valor em uma unidade

        //(--) Operador unário que decrementa valor - decrementa valor de uma unidade

        //(!) Operador unário lógico booleano - nega o valor de uma expressão booleana

        
       int numero1 = 29;

       //repetição- isso é o mesmo que fazer dessa forma numero1 + 1, segue a mesma regra quando quero decrementar(--)
        numero1++;

        System.out.println(numero1); // resultado sera 30

        // negando uma variavel booleano usando o operador de negação !
        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        // Operador ternario 

        int a , b;

         a = 5;
         b = 6;

         String resultado1 = a==b ? "verdadeiro" : "falso";

         System.out.println(resultado1);
    }
}
