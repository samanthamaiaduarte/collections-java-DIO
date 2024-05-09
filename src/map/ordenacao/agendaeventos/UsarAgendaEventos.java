package map.ordenacao.agendaeventos;

import java.time.LocalDate;

public class UsarAgendaEventos {

	public static void main(String[] args) {
		AgendaEventos eventos = new AgendaEventos();
		
		eventos.adicionarEvento(LocalDate.of(2021, 12, 31), "Show da Virada 2021", "Ivete Sangalo");
		eventos.adicionarEvento(LocalDate.of(2022, 12, 31), "Show da Virada 2022", "Claudia Leite");
		eventos.adicionarEvento(LocalDate.of(2023, 12, 31), "Show da Virada 2023", "Roupa Nova");
		eventos.adicionarEvento(LocalDate.of(2024, 12, 31), "Show da Virada 2024", "Caetano Veloso");
		
		eventos.exibirAgenda();
		
		System.out.println();
		System.out.println("Próximo evento: " + eventos.obterProximoEvento());

	}

}
