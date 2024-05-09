package map.ordenacao.agendaeventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> agenda;
	
	public AgendaEventos() {
		agenda = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		agenda.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(agenda);
		System.out.println(agendaOrdenada);
	}
	
	public Evento obterProximoEvento() {
		Evento evento = null;
		
		if(!agenda.isEmpty()) {
			Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(agenda);
			for(LocalDate key : agendaOrdenada.keySet()) {
				if(key.isAfter(LocalDate.now())) {
					evento = agendaOrdenada.get(key);
					break;
				}
			}
		}
		return evento;
	}
}
