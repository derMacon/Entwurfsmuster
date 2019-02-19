package headfirst.command.fernsteuerung;

public class Ventilator {
	String ort = "";
	int stufe;
	public static final int SCHNELL = 2;
	public static final int MITTEL = 1;
	public static final int LANGSAM = 0;
 
	public Ventilator(String ort) {
		this.ort = ort;
	}
  
	public void schnell() {
		// Schaltet den Ventilator auf schnell
		stufe = SCHNELL;
		System.out.println(ort + ": Ventilator läuft schneller Stufe");
 
	} 

	public void mittel() {
		// Schaltet den Ventilator auf mittel
		stufe = MITTEL;
		System.out.println(ort + ": Ventilator läuft auf mittlerer Stufe");
	}

	public void langsam() {
		// Schaltet den Ventilator auf langsam
		stufe = LANGSAM;
		System.out.println(ort + ": Ventilator läuft auf langsamer Stufe");
	}
 
	public void aus() {
		// Schaltet den Ventilator aus
		stufe = 0;
		System.out.println(ort + ": Ventilator ist aus");
	}
 
	public int getGeschwindigkeit() {
		return stufe;
	}
}
