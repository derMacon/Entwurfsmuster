package headfirst.combining.enten;

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
 
		System.out.println("\nEntensimulator");
 
		simulieren(stockEnte);
		simulieren(moorEnte);
		simulieren(lockPfeife);
		simulieren(gummiEnte);
	}
   
	void simulieren(Quakfaehig ente) {
		ente.quaken();
	}
}
