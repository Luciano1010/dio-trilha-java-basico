package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Luciano", 41496005);
        agendaContatos.adicionarContato("Ivone", 987171595);
        agendaContatos.adicionarContato("Lucas", 12123213);
        agendaContatos.adicionarContato("Paulo", 23332412);
        agendaContatos.adicionarContato("Paulo", 976543123);

        // agendaContatos.exibirContato();

        System.out.println("O numero do nome pesquisado é " + agendaContatos.pesquisarPorNome("Luciano"));

        agendaContatos.removerContato("Paulo");

        agendaContatos.exibirContato();

    }

}
