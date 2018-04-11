import java.util.LinkedList;

public class Junior implements Ricercatore{
	
	

		
	private float stipendio;
	private String nome;
	private String cognome;
	private String codice;
	
	
	
	
	
	public Junior(float stipendio, String nome, String cognome, String codice) {
		super();
		this.stipendio = stipendio;
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
	}


	@Override
	public String toString() {
		return "Junior [stipendio=" + stipendio + ", nome=" + nome + ", cognome=" + cognome + ", codice=" + codice
				+ "]";
	}
	
	
	@Override
	public float getStipendio() {
		// TODO Auto-generated method stub
		return this.stipendio;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	
}
