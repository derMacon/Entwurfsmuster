package headfirst.state.kaugummizustand;

public class AusverkauftZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;
 
    public AusverkauftZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }
 
	public void münzeEinwerfen() {
		System.out.println("Sie können keine Münze einwerfen, Automat ist ausverkauft");
	}
 
	public void münzeAuswerfen() {
		System.out.println("Auswurf nicht möglich, Sie haben keine Münze eingeworfen");
	}
 
	public void griffDrehen() {
		System.out.println("Sie haben gedreht, aber es sind keine Kugeln da");
	}
 
	public void kugelAusgeben() {
		System.out.println("Es wird keine Kugel ausgegeben");
	}
 
	public String toString() {
		return "ausverkauft";
	}
}
