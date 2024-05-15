package equipamentos.dispositivomultifuncional;
import equipamentos.dispositosmoveis.DispositvoMovel;
import equipamentos.navegadorweb.NavegadorWeb;
import equipamentos.reprodutormusical.ReprodutorMusical;

public class DispositivoMultifuncional implements DispositvoMovel, ReprodutorMusical, NavegadorWeb {

    @Override
    public void exibirPagina() {
       System.out.println("Exibindo pagina pelo celular");
    }

    @Override
    public void novaPagina() {
      System.out.println("Nova pagina pelo celular");
    }

    @Override
    public void atualizarPagina() {
      System.out.println("Atualizando pagina pelo celular");
    }

    @Override
    public void ligar() {
       System.out.println("Ligando pelo celular");
    }

    @Override
    public void atender() {
     System.out.println("Atendendo ligação pelo cel");
    }

    @Override
    public void atenderCorreioDeVoz() {
        System.out.println("Ouvindo correio de voz pelo celular");
    }

    @Override
    public void tocarMusica() {
      System.out.println("Tocando musica no celular");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica no celular");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a musica no celular");
    }
    
}
