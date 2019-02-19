package headfirst.combining.adapter;

public class EntenSimulator {
	public static void main(String[] args) {
		EntenSimulator simulator = new EntenSimulator();
		simulator.simulieren();
	}

	void simulieren() {
		Quakfaehig stockEnte = new StockEnte();
		Quakfaehig moorEnte = new MoorEnte();
		Quakfaehig lockPfeife = new LockPfeife();
		Quakfaehig gummiEnte = new GummiEnte();
		Quakfaehig gansEnte = new GansAdapter(new Gans());
 
		System.out.println("\nEntensimulator: mit Adapter für Gans");
 
		simulieren(stockEnte);
		simulieren(moorEnte);
		simulieren(lockPfeife);
		simulieren(gummiEnte);
		simulieren(gansEnte);
	}
 
	void simulieren(Quakfaehig ente) {
		ente.quaken();
	}
}
