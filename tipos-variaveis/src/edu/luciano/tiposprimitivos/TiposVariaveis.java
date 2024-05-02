package edu.luciano.tiposprimitivos;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos de dados e suas capacidades minima e maxima
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // variaveis - neste exemplo mostra que a variavel numero iniciou-se em 1 e ao longo do codigo ela foi alterada para 2.
        int numero = 1;
        numero = 2;

        // const - aqui estou declarando uma const e seguindo a convençao em ser o nome da variavel em cx alta, foi tentando mudar o valor mais ja esta mostrando erro.
        final double VALOR_DO_PI = 3.1;
        
        // VALOR_DO_PI = 10;
    }
}
