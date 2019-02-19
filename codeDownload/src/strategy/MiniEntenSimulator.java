package headfirst.strategy;

public class MiniEntenSimulator {
 
	public static void main(String[] args) {
 
		StockEnte	stockente = new StockEnte();
		GummiEnte	gummiEntchen = new GummiEnte();
		LockEnte	lockente = new LockEnte();
 
		ModellEnte	modellEnte = new ModellEnte();

		stockente.tuQuaken();
		gummiEntchen.tuQuaken();
		lockente.tuQuaken();
   
		modellEnte.tuFliegen();	
		modellEnte.setFlugVerhalten(new FliegtRaketenGetrieben());
		modellEnte.tuFliegen();
	}
}
