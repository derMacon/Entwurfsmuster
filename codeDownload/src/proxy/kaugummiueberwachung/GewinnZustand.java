package headfirst.proxy.kaugummiueberwachung;

public class GewinnZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;
 
    public GewinnZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }
 
	public void münzeEinwerfen() {
		System.out.println("Bitte warten Sie, Sie erhalten eine Kugel");
	}
 
	public void münzeAuswerfen() {
		System.out.println("Bitte warten Sie, Sie erhalten eine Kugel");
	}
 
	public void griffDrehen() {
		System.out.println("Auch wenn Sie zweimal drehen, bekommen Sie keine zweite Kugel");
	}
 
	public void kugelAusgeben() {
		System.out.println("SIE HABEN GEWONNEN! Sie bekommen zwei Kugeln für Ihr Geld");
		try {
			kaugummiAutomat.kugelFreigeben();
			if (kaugummiAutomat.getAnzahl() == 0) {
				kaugummiAutomat.setZustand(kaugummiAutomat.getAusverkauftZustand());
			} else {
				kaugummiAutomat.kugelFreigeben();
				if (kaugummiAutomat.getAnzahl() > 0) {
					kaugummiAutomat.setZustand(kaugummiAutomat.getKeineMünzeZustand());
				} else {
           		 	System.out.println("Hoppla, keine Kugeln da!");
					kaugummiAutomat.setZustand(kaugummiAutomat.getAusverkauftZustand());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public String toString() {
		return "gibt zwei Kugeln aus, denn SIE HABEN GEWONNEN!";
	}
}
