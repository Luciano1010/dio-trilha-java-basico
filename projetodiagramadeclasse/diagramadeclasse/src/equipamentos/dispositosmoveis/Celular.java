package equipamentos.dispositosmoveis;


public class Celular implements DispositvoMovel  {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void atenderCorreioDeVoz() {
        System.out.println("Atendendo correio de voz");
    }   
   
    
}
