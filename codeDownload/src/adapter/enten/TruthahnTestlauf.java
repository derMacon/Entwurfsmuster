package headfirst.adapter.enten;

public class TruthahnTestlauf {
	public static void main(String[] args) {
		StockEnte ente = new StockEnte();
		Truthahn entenAdapter = new EnteAdapter(ente);
 
		for(int i=0;i<10;i++) {
			System.out.println("Der Enten-Adapter sagt ...");
			entenAdapter.kollern();
			entenAdapter.fliegen();
		}
	}
}
