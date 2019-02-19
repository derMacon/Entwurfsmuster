package headfirst.combining.observer;

public class EntenSimulator {
	public static void main(String[] args) {
		EntenSimulator simulator = new EntenSimulator();
		AbstrakteEntenFabrik entenFabrik = new ZaehlendeEntenFabrik();
 
		simulator.simulieren(entenFabrik);
	}
  
	void simulieren(AbstrakteEntenFabrik entenfabrik) {
  
		Quakfaehig moorEnte = entenfabrik.erzeugeMoorEnte();
		Quakfaehig lockPfeife = entenfabrik.erzeugeLockPfeife();
		Quakfaehig gummiEnte = entenfabrik.erzeugeGummiEnte();
		Quakfaehig gansEnte = new GansAdapter(new Gans());
 
		Schar EntenSchar = new Schar();
 
		EntenSchar.hinzufügen(moorEnte);
		EntenSchar.hinzufügen(lockPfeife);
		EntenSchar.hinzufügen(gummiEnte);
		EntenSchar.hinzufügen(gansEnte);
 
		Schar stockEntenSchar = new Schar();
 
		Quakfaehig stockEnte1 = entenfabrik.erzeugeStockEnte();
		Quakfaehig stockEnte2 = entenfabrik.erzeugeStockEnte();
		Quakfaehig stockEnte3 = entenfabrik.erzeugeStockEnte();
		Quakfaehig stockEnte4 = entenfabrik.erzeugeStockEnte();

		stockEntenSchar.hinzufügen(stockEnte1);
		stockEntenSchar.hinzufügen(stockEnte2);
		stockEntenSchar.hinzufügen(stockEnte3);
		stockEntenSchar.hinzufügen(stockEnte4);

		EntenSchar.hinzufügen(stockEntenSchar);

		System.out.println("\nEntensimulator: mit Observer");

		Quakologe quakologe = new Quakologe();
		EntenSchar.registriereBeobachter(quakologe);

		simulieren(EntenSchar);

		System.out.println("\nDie Enten haben " + 
		                   QuakZaehler.getQuaks() + 
		                   "-mal gequakt.");
	}
 
	void simulieren(Quakfaehig ente) {
		ente.quaken();
	}
}
