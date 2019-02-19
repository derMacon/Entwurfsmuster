package headfirst.templatemethod.sortieren;

public class Ente implements Comparable {
	String name;
	int gewicht;
  
	public Ente(String name, int gewicht) {
		this.name = name;
		this.gewicht = gewicht;
	}
 
	public String toString() {
		return name + " wiegt " + gewicht;
	}
 
 
  
	public int compareTo(Object object) {
 
		Ente andereEnte = (Ente)object;
  
		if (this.gewicht < andereEnte.gewicht) {
			return -1;
		} else if (this.gewicht == andereEnte.gewicht) {
			return 0;
		} else { // this.gewicht > andereEnte.gewicht
			return 1;
		}
	}
}
