package headfirst.facade.heimkino;

public class CdSpieler {
	String beschreibung;
	int aktuellerTrack;
	Verstaerker verstärker;
	String titel;
	
	public CdSpieler(String beschreibung, Verstaerker verstärker) {
		this.beschreibung = beschreibung;
		this.verstärker = verstärker;
	}
 
	public void ein() {
		System.out.println(beschreibung + " an");
	}
 
	public void aus() {
		System.out.println(beschreibung + " aus");
	}

	public void auswerfen() {
		titel = null;
		System.out.println(beschreibung + " ausgeworfen");
	}
 
	public void spielen(String titel) {
		this.titel = titel;
		aktuellerTrack = 0;
		System.out.println(beschreibung + " spielt \"" + titel + "\"");
	}

	public void spielen(int track) {
		if (titel == null) {
			System.out.println(beschreibung + " kann Track " + aktuellerTrack + 
					"nicht abspielen, keine CD eingelegt");
		} else {
			aktuellerTrack = track;
			System.out.println(beschreibung + " spiele Track " + aktuellerTrack);
		}
	}

	public void beenden() {
		aktuellerTrack = 0;
		System.out.println(beschreibung + " beendet");
	}
 
	public void pause() {
		System.out.println(beschreibung + " angehalten \"" + titel + "\"");
	}
 
	public String toString() {
		return beschreibung;
	}
}
