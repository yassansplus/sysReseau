
public class TestBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banque b = new Banque();
		Compte  c = b.compteVerife("Michaelangelo", "123456");
		b.retirer(120, c);
		b.deposerSomme(500, c);
		b.solde(c);
	}

}
