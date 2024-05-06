public class LaçoFor {
    public static void main(String[] args) {
        
        /*
         * for(bloco de inicilização; expresão booleana; bloco de atualizção){
         *     o comando for só vai parar quando a expressão boolena se tornar falsa
         * }
         * o comando Break - ele interropem a interação
         * o comando continue - o nome ja diz ele continua a interaçao
        */

        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Contando carneirinho" + carneirinhos);
        }

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // o x representa o indicde do array alunos
	    for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}

        // laço for each - modo simplificado
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }

        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
            break; // onde eu posso parar a interação por meio de uma condicional
                   // se fosse a palavra continue a laço vai ate o seu final


            System.out.println(numero);
        }
    }


}
