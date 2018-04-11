import java.util.LinkedList;
import java.util.List;

public class Team {
	String nome;
	String codice;
	Progetto progetto;
	List <Senior> seniors;
	List <Junior> juniors;
	TeamLeader teamLeader;
	public Team(String nome, String codice, Progetto progetto, List<Senior> seniors, List<Junior> juniors,
			TeamLeader teamLeader) {
		super();
		this.nome = nome;
		this.codice = codice;
		this.progetto = progetto;
		seniors = new LinkedList<>();
		juniors = new LinkedList<>();
		this.teamLeader = teamLeader;
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
	public Progetto getProgetto() {
		return progetto;
	}
	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}
	public List<Senior> getSeniors() {
		return seniors;
	}
	public void setSeniors(List<Senior> seniors) {
		this.seniors = seniors;
	}
	public List<Junior> getJuniors() {
		return juniors;
	}
	public void setJuniors(List<Junior> juniors) {
		this.juniors = juniors;
	}
	public TeamLeader getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(TeamLeader teamLeader) {
		this.teamLeader = teamLeader;
	}
	
	
	
	
	
	
	
	
	
}
