package headfirst.facade.heimkino;

public class Leinwand {
	String beschreibung;
	
	public Leinwand(String beschreibung) {
		this.beschreibung = beschreibung;
	}
 
	public void hoch() {
		System.out.println(beschreibung + " fährt hoch");
	}
 
	public void runter() {
		System.out.println(beschreibung + " fährt runter");
	}
 
  
        public String toString() {
                return beschreibung;
        }
}
