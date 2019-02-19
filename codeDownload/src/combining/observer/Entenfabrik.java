package headfirst.combining.observer;

public class Entenfabrik extends AbstrakteEntenFabrik {
  
	public Quakfaehig erzeugeStockEnte() {
		return new StockEnte();
	}
  
	public Quakfaehig erzeugeMoorEnte() {
		return new MoorEnte();
	}
  
	public Quakfaehig erzeugeLockPfeife() {
		return new LockPfeife();
	}
   
	public Quakfaehig erzeugeGummiEnte() {
		return new GummiEnte();
	}
}
