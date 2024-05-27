package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Ivone", 987171595);
        agendaContatos.adicionarContato("Luciano", 952349531);
        agendaContatos.adicionarContato("LucianoSimões", 9523);
        agendaContatos.adicionarContato("Lucas", 952349531);
        agendaContatos.adicionarContato("Paulo", 952345321);

        agendaContatos.exibirContatos();

        System.out.println("Pesquisa por nome " + agendaContatos.pesquisarPorNome("Luciano"));

        System.out.println(agendaContatos.atualizarContato("LucianoSimões", 95232425));

        agendaContatos.exibirContatos();

    }

}
