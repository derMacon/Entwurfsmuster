package headfirst.combining.observer;

public class GansAdapter implements Quakfaehig {
	Gans gans;
	SenderRing senderRing;

	public GansAdapter(Gans gans) {
		this.gans = gans;
		senderRing = new SenderRing(this);
	}
 
	public void quaken() {
		gans.schnattern();
		benachrichtigeBeobachtende();
	}

	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}

	public String toString() {
		return "sich als Ente ausgebende Gans";
	}
}
