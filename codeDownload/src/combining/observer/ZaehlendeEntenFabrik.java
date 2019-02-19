package headfirst.combining.observer;

public class ZaehlendeEntenFabrik extends AbstrakteEntenFabrik {
  
	public Quakfaehig erzeugeStockEnte() {
		return new QuakZaehler(new StockEnte());
	}
  
	public Quakfaehig erzeugeMoorEnte() {
		return new QuakZaehler(new MoorEnte());
	}
  
	public Quakfaehig erzeugeLockPfeife() {
		return new QuakZaehler(new LockPfeife());
	}
   
	public Quakfaehig erzeugeGummiEnte() {
		return new QuakZaehler(new GummiEnte());
	}
}
