package headfirst.combining.observer;

public class Quakologe implements Beobachter {
 
	public void aktualisieren(QuakBeobachtungsSubjekt ente) {
		System.out.println("Quakologe: " + ente + " hat gerade gequakt.");
	}
 
	public String toString() {
		return "Quakologe";
	}
}
