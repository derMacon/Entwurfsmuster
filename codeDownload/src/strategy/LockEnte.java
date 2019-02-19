package headfirst.strategy;

public class LockEnte extends Ente {
	public LockEnte() {
		setFlugVerhalten(new FliegtGarNicht());
		setQuakVerhalten(new StummesQuaken());
	}
	public void anzeigen() {
		System.out.println("Ich bin eine Lockente");
	}
}
