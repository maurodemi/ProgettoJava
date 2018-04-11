
public class Senior implements Ricercatore {
	
	String nome;
	String cognome;
	String codice;
	float stipendio;
	float bonus;
	@Override
	
	
	
	
	
	public float getStipendio() {
		// TODO Auto-generated method stub
		return this.bonus + this.stipendio;
	}
	public Senior(String nome, String cognome, String codice, float stipendio, float bonus) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
		this.stipendio = stipendio;
		this.bonus = bonus;
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
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public void setStipendio(float stipendio) {
		this.stipendio = stipendio;
	}
	
	
		
	
}
