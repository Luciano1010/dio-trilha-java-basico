package sistemademensagens;

import sistemademensagens.apps.FacebookMenssenger;
import sistemademensagens.apps.MSNmenssenger;
import sistemademensagens.apps.ServiçoDeMensagensInstantanea;
import sistemademensagens.apps.TelegramMenssenger;

public class App {
    public static void main(String[] args) {

        FacebookMenssenger facebook = new FacebookMenssenger();
      //  facebook.enviarMensagem();

        MSNmenssenger msn = new MSNmenssenger();
      //  msn.enviarMensagem();

        TelegramMenssenger telegram = new TelegramMenssenger();
      //  telegram.enviarMensagem();

        ServiçoDeMensagensInstantanea smi = null;

        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn"))
            smi = new MSNmenssenger();
        if (appEscolhido.equals("tlg"))
            smi = new TelegramMenssenger();
        if (appEscolhido.equals("fbm"))
            smi = new FacebookMenssenger();
        
        smi.enviarMensagem();
        smi.receberMensagem();

        
        

    }
}
