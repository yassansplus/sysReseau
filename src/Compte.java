
public class Compte {
	private String userName;
	private String password;
	private int solde;
	
	
	public Compte(String userName, String password, int solde) {
		super();
		this.userName = userName;
		this.password = password;
		this.solde = solde;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getSolde() {
		return solde;
	}
	
	public void addSolde(int somme){
		this.solde += somme;
	}
	public void retirerSolde(int somme){
		this.solde -= somme;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	
	
	
	
	
}
