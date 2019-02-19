package headfirst.facade.heimkino;

public class Tuner {
	String beschreibung;
	Verstaerker verstärker;
	double frequenz;
	
	public Tuner(String beschreibung, Verstaerker verstärker) {
		this.beschreibung = beschreibung;
	}
 
	public void ein() {
		System.out.println(beschreibung + " an");
	}
 
	public void aus() {
		System.out.println(beschreibung + " aus");
	}
 
	public void setFrequenz(double frequenz) {
		System.out.println(beschreibung + " setze Frequenz auf " + frequenz);
		this.frequenz = frequenz;
	}
 
	public void setAm() {
		System.out.println(beschreibung + " aktiviere AM-Modus");
	}
 
	public void setFm() {
		System.out.println(beschreibung + " aktiviere FM-Modus");
	}
  
        public String toString() {
                return beschreibung;
        }
}
