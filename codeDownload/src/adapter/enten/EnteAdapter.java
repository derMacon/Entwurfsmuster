package headfirst.adapter.enten;
import java.util.Random;

public class EnteAdapter implements Truthahn {
	Ente ente;
	Random zufall;
 
	public EnteAdapter(Ente ente) {
		this.ente = ente;
		zufall = new Random();
	}
    
	public void kollern() {
		ente.quaken();
	}
  
	public void fliegen() {
		if (zufall.nextInt(5)  == 0) {
		     ente.fliegen();
		}
	}
}
