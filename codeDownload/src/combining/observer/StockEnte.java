package headfirst.combining.observer;

public class StockEnte implements Quakfaehig {
	SenderRing senderRing;
 
	public StockEnte() {
		senderRing = new SenderRing(this);
	}
 
	public void quaken() {
		System.out.println("Quak");
		benachrichtigeBeobachtende();
	}
 
	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}
 
	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}
 
	public String toString() {
		return "Stockente";
	}
}
