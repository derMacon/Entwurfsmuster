package headfirst.state.kaugummizustandgewinn;

public class KeineMuenzeZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;
 
    public KeineMuenzeZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }
 
	public void münzeEinwerfen() {
		System.out.println("Sie haben eine Münze eingeworfen");
		kaugummiAutomat.setZustand(kaugummiAutomat.getHatMünzeZustand());
	}
 
	public void münzeAuswerfen() {
		System.out.println("Sie haben keine Münze eingeworfen");
	}
 
	public void griffDrehen() {
		System.out.println("Sie haben gedreht, aber es ist keine Münze da");
	 }
 
	public void kugelAuswerfen() {
		System.out.println("Sie müssen zuerst bezahlen");
	} 
 
	public String toString() {
		return "bereit für Münzeinwurf";
	}
}
