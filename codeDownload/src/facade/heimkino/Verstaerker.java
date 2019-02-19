package headfirst.facade.heimkino;

public class Verstaerker {
	String beschreibung;
	Tuner tuner;
	DvdSpieler dvd;
	CdSpieler cd;
	
	public Verstaerker(String beschreibung) {
		this.beschreibung = beschreibung;
	}
 
	public void ein() {
		System.out.println(beschreibung + " an");
	}
 
	public void aus() {
		System.out.println(beschreibung + " aus");
	}
 
	public void setStereoSound() {
		System.out.println(beschreibung + " aktiviere Stereo-Modus");
	}
 
	public void setSurroundSound() {
		System.out.println(beschreibung + " aktiviere Surround-Sound (5 Boxen, 1 Subwoofer)");
	}
 
	public void setLautstärke(int stufe) {
		System.out.println(beschreibung + " setze Lautstärke auf " + stufe);
	}

	public void setTuner(Tuner tuner) {
		System.out.println(beschreibung + " setze Tuner auf " + dvd);
		this.tuner = tuner;
	}
  
	public void setDvd(DvdSpieler dvd) {
		System.out.println(beschreibung + " setze DVD-Spieler auf " + dvd);
		this.dvd = dvd;
	}
 
	public void setCd(CdSpieler cd) {
		System.out.println(beschreibung + " setze CD-Spieler auf " + cd);
		this.cd = cd;
	}
 
	public String toString() {
		return beschreibung;
	}
}
