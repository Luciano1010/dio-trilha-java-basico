public class ResultaEscolarTernario {
    public static void main(String[] args) {

        /* com a expressão ternaria o resultado fica guardada em uma varivavel deixano o codigo mais limpo */ 
        int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println("estrutura composta com if e else" + resultado);

        // aqui exemplifiquei a estruta encadead if - elseif - else
        String resultado1 = nota >=7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
		System.out.println("Estrura encandeada composta com if - elseif - else" + resultado1);
    }


}
