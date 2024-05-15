package equipamentos.reprodutormusical;
public class DispositovoDeMusica implements ReprodutorMusical {
   
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no dispositivo de musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pause na musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a musica");
    }
}
