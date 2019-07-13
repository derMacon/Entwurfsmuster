package headfirst.command.party;

public class FernseherAnBefehl implements Befehl {
	Fernseher fernseher;

	public FernseherAnBefehl(Fernseher fernseher) {
		this.fernseher= fernseher;
	}

	public void ausführen() {
		fernseher.ein();
		fernseher.setSender();
	}

	public void rückgängig() {
		fernseher.aus();
	}
}
