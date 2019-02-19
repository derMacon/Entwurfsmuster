package headfirst.adapter.enten;

public class EnteTestlauf {
	public static void main(String[] args) {
		StockEnte duck = new StockEnte();
 
		WilderTruthahn truthahn = new WilderTruthahn();
		Ente truthahnAdapter = new TruthahnAdapter(truthahn);
   
		System.out.println("Der Truthahn sagt ...");
		truthahn.kollern();
		truthahn.fliegen();
 
		System.out.println("\nDie Ente sagt ...");
		testeEnte(duck);
  
		System.out.println("\nDer TruthahnAdapter sagt ...");
		testeEnte(truthahnAdapter);
	}
 
	static void testeEnte(Ente ente) {
		ente.quaken();
		ente.fliegen();
	}
}
