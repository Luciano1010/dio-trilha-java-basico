package sistemademensagens.apps;

public class TelegramMenssenger extends ServiçoDeMensagensInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem Pelo Telegram");
        
    }

    @Override
    public void receberMensagem() {
        
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    @Override
    protected void salvarHistoricoMensagem() {
        
        throw new UnsupportedOperationException("Unimplemented method 'salvarHistoricoMensagem'");
    }

}
