package sistemademensagens.apps;

public class FacebookMenssenger extends ServiçoDeMensagensInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }

    @Override
    protected void salvarHistoricoMensagem() {
       System.out.println("Salvando histórico Facebook");
    }

   
}
