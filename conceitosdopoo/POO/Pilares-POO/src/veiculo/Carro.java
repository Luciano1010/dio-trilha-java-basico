package veiculo;

public class Carro extends Veiculo {

    public void Ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel(){
        System.out.println("Carro com combustivel");
    }

    private void confereCambio(){
        System.out.println("Cambio na marcha D");
    }

    public void dirigir(){
        System.out.println("Dirigindo");
    }
}
