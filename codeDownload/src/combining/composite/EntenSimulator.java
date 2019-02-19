package headfirst.combining.composite;

public class EntenSimulator {

	public static void main(String[] args) {
		EntenSimulator simulator = new EntenSimulator();
		AbstrakteEntenFabrik entenFabrik = new ZaehlendeEntenFabrik();
 
		simulator.simulieren(entenFabrik);
	}
 
	void simulieren(AbstrakteEntenFabrik entenFabrik) {
		Quakfaehig moorEnte = entenFabrik.erzeugeMoorEnte();
		Quakfaehig lockPfeife = entenFabrik.erzeugeLockPfeife();
		Quakfaehig gummiEnte = entenFabrik.erzeugeGummiEnte();
		Quakfaehig gansEnte = new GansAdapter(new Gans());

		System.out.println("\nEntensimulator: mit Composite in Scharen");

		Schar entenSchar = new Schar();

		entenSchar.hinzufügen(moorEnte);
		entenSchar.hinzufügen(lockPfeife);
		entenSchar.hinzufügen(gummiEnte);
		entenSchar.hinzufügen(gansEnte);

		Schar stockEntenSchar = new Schar();

		Quakfaehig stockEnte1 = entenFabrik.erzeugeStockEnte();
		Quakfaehig stockEnte2 = entenFabrik.erzeugeStockEnte();
		Quakfaehig stockEnte3 = entenFabrik.erzeugeStockEnte();
		Quakfaehig stockEnte4 = entenFabrik.erzeugeStockEnte();

		stockEntenSchar.hinzufügen(stockEnte1);
		stockEntenSchar.hinzufügen(stockEnte2);
		stockEntenSchar.hinzufügen(stockEnte3);
		stockEntenSchar.hinzufügen(stockEnte4);

		entenSchar.hinzufügen(stockEntenSchar);

		System.out.println("\nEntensimulator: Simulation der gesamten Entenschar");
		simulieren(entenSchar);

		System.out.println("\nEntensimulator: Simulation der Stockentenschar");
		simulieren(stockEntenSchar);

		System.out.println("\nDie Enten haben " + 
		                   QuakZaehler.getQuaks() + 
		                   "-mal gequakt.");
	}

	void simulieren(Quakfaehig ente) {
		ente.quaken();
	}
}
