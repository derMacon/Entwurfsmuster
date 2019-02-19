package headfirst.combining.decorator;

public class EntenSimulator {
	public static void main(String[] args) {
		EntenSimulator simulator = new EntenSimulator();
		simulator.simulieren();
	}

	void simulieren() {
		Quakfaehig stockEnte = new QuakZaehler(new StockEnte());
		Quakfaehig moorEnte = new QuakZaehler(new MoorEnte());
		Quakfaehig lockPfeife = new QuakZaehler(new LockPfeife());
		Quakfaehig gummiEnte = new QuakZaehler(new GummiEnte());
		Quakfaehig gansEnte = new GansAdapter(new Gans());

		System.out.println("\nEntensimulator: mit Decorator");

		simulieren(stockEnte);
		simulieren(moorEnte);
		simulieren(lockPfeife);
		simulieren(gummiEnte);
		simulieren(gansEnte);

		System.out.println("Die Enten haben " + 
		                   QuakZaehler.getQuaks() + "-mal gequakt.");
	}

	void simulieren(Quakfaehig ente) {
		ente.quaken();
	}
}
