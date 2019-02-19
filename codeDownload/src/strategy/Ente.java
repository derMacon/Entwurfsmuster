package headfirst.strategy;

public abstract class Ente {
	FlugVerhalten flugVerhalten;
	QuakVerhalten quakVerhalten;
 
	public Ente() {
	}
 
	public void setFlugVerhalten (FlugVerhalten fv) {
		flugVerhalten = fv;
	}
 
	public void setQuakVerhalten(QuakVerhalten qv) {
		quakVerhalten = qv;
	}
 
	abstract void anzeigen();
 
	public void tuFliegen() {
		flugVerhalten.fliegen();
	}
 
	public void tuQuaken() {
		quakVerhalten.quaken();
	}
 
	public void schwimmen() {
		System.out.println("Alle Enten fliegen, auch Holzenten!");
	}
}
