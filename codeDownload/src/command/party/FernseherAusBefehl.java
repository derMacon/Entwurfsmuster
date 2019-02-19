package headfirst.command.party;

public class FernseherAusBefehl implements Befehl {
	Fernseher fernseher;

	public FernseherAusBefehl(Fernseher fernseher) {
		this.fernseher= fernseher;
	}

	public void ausführen() {
		fernseher.aus();
	}

	public void rückgängig() {
		fernseher.ein();
	}
}
