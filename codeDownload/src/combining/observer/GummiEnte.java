package headfirst.combining.observer;

public class GummiEnte implements Quakfaehig {
	SenderRing senderRing;

	public GummiEnte() {
		senderRing = new SenderRing(this);
	}
 
	public void quaken() {
		System.out.println("Quietsch");
		benachrichtigeBeobachtende();
	}

	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}
  
	public String toString() {
		return "Gummiente";
	}
}
