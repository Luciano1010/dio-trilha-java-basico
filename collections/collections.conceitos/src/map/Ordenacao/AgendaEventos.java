package map.Ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirEventos() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        // Set<LocalDate> dataSet = eventosMap.keySet(); // retornando todas as keys
        // Collection<Evento> values = eventosMap.values(); // retornado uma collections
        // com todos valores

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximaEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximaEvento = entry.getValue();
                System.out.println("O proximo evento " + proximaEvento + "acontecera na data " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        
        AgendaEventos agenda = new AgendaEventos(); 

        agenda.adicionarEvento(LocalDate.of(2024, 06 , 01), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2022, 06, 16), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2022, 04, 16), "Evento 3", "Atração 3");
        agenda.adicionarEvento(LocalDate.of(2021, 07, 20), "Evento 4", "Atração 4");

        agenda.exibirEventos();

        agenda.obterProximoEvento();
    }

}
