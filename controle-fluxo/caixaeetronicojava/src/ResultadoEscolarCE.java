public class ResultadoEscolarCE {
    public static void main(String[] args) {
        int nota = 4;
        // estrutura composta onde pode ter varias condições a serem analisadas
        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }
}
