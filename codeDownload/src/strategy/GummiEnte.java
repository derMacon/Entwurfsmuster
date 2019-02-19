package headfirst.strategy;

public class GummiEnte extends Ente {
 
	public GummiEnte() {
		flugVerhalten = new FliegtGarNicht();
		quakVerhalten = new Quietschen();
	}
 
	public void anzeigen() {
		System.out.println("Ich bin eine Gummi-Ente");
	}
}
