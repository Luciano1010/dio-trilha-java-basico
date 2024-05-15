package equipamentos.navegadorweb;
public class Notebook implements NavegadorWeb{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina da Web pelo notebook");
    }

    @Override
    public void novaPagina() {
        System.out.println("Abrindo nova aba pelo notebook");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo notebook");
    }
    
}
