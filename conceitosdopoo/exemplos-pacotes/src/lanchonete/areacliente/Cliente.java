package lanchonete.areacliente;


public class Cliente {
    // atributos
    private String nome;
    private String cpf;
    private int pedido;
   
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        
    }

    public Cliente(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getpedido(){
        return pedido;
    }

    public void setpedido(int pedido){
        this.pedido = pedido;
    }

    public void escolherLanche(){
        System.out.println("ESCOLHENDO O LANCHE");
    }

    public void fazerPedido(){
        System.out.println("FAZENDO PEDIDO");
    }

    public void pagarConta(){
        System.out.println("PAGANDO CONTA");
    }

    public void consultarSaldoAplicativo(){
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }
    public void pegarPedidoBalcao(){
        System.out.println("PEGANDO PEDIDO NA BALCÃO");
    }


}
