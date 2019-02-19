package headfirst.combining.observer;

public class LockPfeife implements Quakfaehig {
	SenderRing senderRing;

	public LockPfeife() {
		senderRing = new SenderRing(this);
	}
 
	public void quaken() {
		System.out.println("Kwaak");
		benachrichtigeBeobachtende();
	}
 
	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}
 
	public String toString() {
		return "Lockpfeife";
	}
}
