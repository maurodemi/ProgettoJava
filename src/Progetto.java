import java.util.Date;

public class Progetto {
	String nome;
	String codice;
	Date dataI;
	Date dataF;
	double budget;
	public Progetto(String nome, String codice, Date dataI, Date dataF, double budget) {
		super();
		this.nome = nome;
		this.codice = codice;
		this.dataI = dataI;
		this.dataF = dataF;
		this.budget = budget;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public Date getDataI() {
		return dataI;
	}
	public void setDataI(Date dataI) {
		this.dataI = dataI;
	}
	public Date getDataF() {
		return dataF;
	}
	public void setDataF(Date dataF) {
		this.dataF = dataF;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}

	
	
	
	
}
