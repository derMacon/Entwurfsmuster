package headfirst.combining.factory;

public class EntenSimulator {
	public static void main(String[] args) {
		EntenSimulator simulator = new EntenSimulator();
		AbstrakteEntenFabrik entenFabrik = new ZaehlendeEntenFabrik();
 
		simulator.simulieren(entenFabrik);
	}
 
	void simulieren(AbstrakteEntenFabrik entenFabrik) {
		Quakfaehig stockEnte = entenFabrik.erzeugeStockEnte();
		Quakfaehig moorEnte = entenFabrik.erzeugeMoorEnte();
		Quakfaehig lockPfeife = entenFabrik.erzeugeLockPfeife();
		Quakfaehig gummiEnte = entenFabrik.erzeugeGummiEnte();
		Quakfaehig gansEnte = new GansAdapter(new Gans());
 
		System.out.println("\nEntensimulator: mit abstrakter Fabrik");
 
		simulieren(stockEnte);
		simulieren(moorEnte);
		simulieren(lockPfeife);
		simulieren(gummiEnte);
		simulieren(gansEnte);
 
		System.out.println("Die Enten haben " + 
		                   QuakZaehler.getQuaks() + 
		                   "-mal gequakt.");
	}
 
	void simulieren(Quakfaehig ente) {
		ente.quaken();
	}
}
