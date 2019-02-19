package headfirst.strategy;

public class MoorEnte extends Ente {
 
	public MoorEnte() {
		flugVerhalten = new FliegtMitFluegeln();
		quakVerhalten = new Quaken();
	}
 
	public void anzeigen() {
		System.out.println("Ich bin eine echte Moorente");
	}
}
