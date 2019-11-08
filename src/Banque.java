import java.util.Hashtable;


public class Banque {
	private  Hashtable<String, Compte> comptes;
	
	
	
	public Banque(){
		comptes  = new Hashtable<String, Compte>();
		comptes.put("Michaelangelo", new Compte("Michaelangelo", "123456", 10000));
		comptes.put("Donnatello", new Compte("Donnatello", "123456", 5000));
		comptes.put("Rafaello", new Compte("Rafaello", "123456", 10000));
		comptes.put("Leonardo", new Compte("Leonardo", "123456", 10000));
		
	}
	public void ouvrirCompte(String name, String password){
		if(comptes.get(name) == null ){
			System.out.println("Ouverture du compte de Mr "+ name+"");
			comptes.put(name, new Compte(name, password, 0));
			
		}

		
	}
	public Compte compteVerife(String nom, String password){
		
		if(comptes.get(nom) != null && comptes.get(nom).getUserName().equals(nom) && comptes.get(nom).getPassword().equals(password)){
			
			System.out.println("Vous voilà connecté");
			return comptes.get(nom);
		}
		else{
			return null;
		}
		
	}
	
	public int fermerCompte(String nom, String prenom){
		if(comptes.get(nom) != null ){
			int monSolde = comptes.get(nom).getSolde();
			comptes.remove(nom);
			System.out.println("Votre compte est désormait fermé recupérer votre solde");
			return monSolde;
			
		}
		System.out.println("Il n'existe pas de compte à votre nom");
		return 0;

	}
	public void deposerSomme(int somme, Compte c){
		String nom = c.getUserName();
		if(comptes.get(nom) != null){
			System.out.println("Votre compte est crédité de "+ somme +"€");
			comptes.get(nom).addSolde(somme);
		}
		
	}
	
	public int retirer(int somme, Compte c ){
		
		String nom = c.getUserName();
		if(comptes.get(nom) != null){
			comptes.get(nom).retirerSolde(somme);

			System.out.println("Vous avez retiré "+somme+"€ votre solde est desormais de "+ c.getSolde());
		}
		
		return somme;
	}
	
	public int solde(Compte c ){

		String nom = c.getUserName();
		if(comptes.get(nom) != null){
			System.out.println("Votre solde est de "+comptes.get(nom).getSolde()+"€");
			comptes.get(nom).getSolde();
		}
		System.out.println("Il semblerait que vOUS N'ayez pas de compte.");
		return 0;
	}
	
}
