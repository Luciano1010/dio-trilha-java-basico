package equipamentos.dispositivodousuario;

import equipamentos.dispositivomultifuncional.DispositivoMultifuncional;
import equipamentos.dispositosmoveis.Celular;
import equipamentos.navegadorweb.Notebook;

public class InterfaceUsuario {
    public static void main(String[] args){
        
         DispositivoMultifuncional dispostivo = new DispositivoMultifuncional();
         Notebook notebook = new Notebook();
         dispostivo.exibirPagina();
         dispostivo.atualizarPagina();

         notebook.exibirPagina();

         dispostivo.ligar();
         
    }
}
