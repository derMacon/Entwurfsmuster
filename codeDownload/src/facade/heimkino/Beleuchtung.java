package headfirst.facade.heimkino;

public class Beleuchtung {
	String beschreibung;
	
	public Beleuchtung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
  
	public void ein() {
		System.out.println(beschreibung + " an");
	}
  
	public void aus() {
		System.out.println(beschreibung + " aus");
	}
  
	public void dimmen(int stufe) {
		System.out.println(beschreibung + " gedimmt auf " + stufe  + "%");
	}
   
        public String toString() {
                return beschreibung;
        }
}
