package headfirst.state.kaugummizustand;

public class HatMuenzeZustand implements Zustand {
	KaugummiAutomat kaugummiAutomat;
 
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
		kaugummiAutomat.setZustand(kaugummiAutomat.getVerkauftZustand());
	}

    public void kugelAusgeben() {
        System.out.println("Es wird keine Kugel ausgegeben");
    }
 
	public String toString() {
		return "bereit für Drehen des Griffs";
	}
}
