package prova1b;

import java.util.Date;

public class Mensagem {
	private Participante remetente;
	private String texto;
	private Date horaEnviada; 
	
	public Mensagem (Participante remetente, String texto){
		this.remetente = remetente;
		this.texto = texto;
		this.horaEnviada = new Date();
	}

	public String getRemetente() {
		return remetente.getNome();
	}

	public String getTexto() {
		return texto;
	}

	public Date getHoraEnviada() {
		return horaEnviada;
	}

}
