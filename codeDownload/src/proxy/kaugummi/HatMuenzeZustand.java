package headfirst.proxy.kaugummi;

import java.util.Random;

public class HatMuenzeZustand implements Zustand {
	Random randomGewinn = new Random(System.currentTimeMillis());
	transient KaugummiAutomat kaugummiAutomat;
 
	public HatMuenzeZustand(KaugummiAutomat kaugummiAutomat) {
		this.kaugummiAutomat = kaugummiAutomat;
	}
  
	public void münzeEinwerfen() {
		System.out.println("Sie können keine weitere Münze einwerfen");
	}
 
	public void münzeAuswerfen() {
		System.out.println("Münze wird zurückgegeben");
		kaugummiAutomat.setZustand(kaugummiAutomat.getKeineMünzeZustand());
	}
 
	public void griffDrehen() {
		System.out.println("Sie haben den Griff gedreht ...");
		int winner = randomGewinn.nextInt(10);
		if (winner == 0) {
			kaugummiAutomat.setZustand(kaugummiAutomat.getGewinnZustand());
		} else {
			kaugummiAutomat.setZustand(kaugummiAutomat.getVerkauftZustand());
		}
	}

    public void kugelAusgeben() {
        System.out.println("Es wird keine Kugel ausgegeben");
    }
 
	public String toString() {
		return "bereit für Drehen des Griffs";
	}
}
