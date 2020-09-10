package senai;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		System.out.println("--- Sistema de Eventos ---");
		Usuario usuario1 = new Usuario("João");
		Usuario usuario2 = new Usuario("Maria");
		
		System.out.println("--- Evento 1 ---");
		Evento evento1 = new EventoPresencial("Java for Dummies", LocalDate.of(2020, 8, 10), usuario1, "Java introduction for beginners" ,"SENAI/SC", 20);
		evento1.addParticipante(usuario2);
		
		System.out.println("--- Evento 2 ---");
		EventoVirtual evento2 = new EventoVirtual("postgreSQL for Dummies", 
				LocalDate.of(2020, 9, 7), usuario2, "PostgreSQL introduction for beginners", "http://eventovirtual.org.br/123");
		evento2.addParticipante(usuario2);
		
		System.out.println("--- FIM ---");
		
		System.out.println(evento2.getDescricao());
	}
}
