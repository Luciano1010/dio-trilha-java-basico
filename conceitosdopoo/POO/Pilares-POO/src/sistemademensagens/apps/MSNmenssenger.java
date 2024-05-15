package sistemademensagens.apps;

public class MSNmenssenger extends ServiçoDeMensagensInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");    
        salvarHistoricoMensagem();    
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico do MSN");

    }

}


