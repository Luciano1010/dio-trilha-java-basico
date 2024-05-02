package edu.luciano.operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
         //Aritmeticos - atençao o operador + junto com variaveis de tipo textos ele faz concatenação de textos.

         double soma = 10.50 + 15.7;
         int subtracao = 113 - 25;
         int multiplicacao = 20 * 7;
         int divisao = 15 / 3;
         int modulo = 18 % 3;  
         
         // quando se concatenar no inicio ou no meio da expressão o programa para de fazer operação matematicas, a não ser que se coloque as operações em evidencia - por exemplo "1"+(1+1+1) o resultado vai ser 31 - ele soma primeiro pra depois adicionar o numero que veio como texto.
    }
}
