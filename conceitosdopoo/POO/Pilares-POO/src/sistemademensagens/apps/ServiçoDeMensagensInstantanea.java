package sistemademensagens.apps;

public abstract class ServiçoDeMensagensInstantanea {
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem() ;

    protected abstract void salvarHistoricoMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Verificando conexão...");
    }

}
