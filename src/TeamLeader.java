
public class TeamLeader {
	
	private float bonus;
	private String nome;
	private String cognome;
	private String codice;
	private float stipendio;
	
	
	
	public TeamLeader(float bonus, String nome, String cognome, String codice, float stipendio) {
		super();
		this.bonus = bonus;
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
		this.stipendio = stipendio;
	}
	
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
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
	
	@Override
	public String toString() {
		return "TeamLeader [bonus=" + bonus + ", nome=" + nome + ", cognome=" + cognome + ", codice=" + codice + "]";
	}
	
}
