package headfirst.combining.observer;

public class QuakZaehler implements Quakfaehig {
	Quakfaehig ente;
	static int anzahlDerQuaks;
  
	public QuakZaehler(Quakfaehig ente) {
		this.ente = ente;
	}
  
	public void quaken() {
		ente.quaken();
		anzahlDerQuaks++;
	}
 
	public static int getQuaks() {
		return anzahlDerQuaks;
	}
 
	public void registriereBeobachter(Beobachter beobachter) {
		ente.registriereBeobachter(beobachter);
	}
 
	public void benachrichtigeBeobachtende() {
		ente.benachrichtigeBeobachtende();
	}
   
	public String toString() {
		return ente.toString();
	}
}
