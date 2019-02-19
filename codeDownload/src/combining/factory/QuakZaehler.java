package headfirst.combining.factory;

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
   
	public String toString() {
		return ente.toString();
	}
}
