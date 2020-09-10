package senai;

import java.time.LocalDate;

public class Evento {
	
	private String nome;
	private LocalDate data;
	private Usuario organizador;
	private String descricao;
	private Usuario[] participantes;
	private int posicaoParticipantes = 0;
	
	public Evento(String nome, LocalDate data, Usuario organizador, String descricao){
		this.nome = nome;
		this.data = data;
		this.organizador = organizador;
		this.descricao = descricao;
		this.participantes = new Usuario[10];
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public Usuario getOrganizador() {
		return organizador;
	}
	
	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void addParticipante(Usuario participante) {
		this.participantes[this.posicaoParticipantes] = participante;
		this.posicaoParticipantes++;
	}
	
}
