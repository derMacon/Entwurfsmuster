package headfirst.command.party;

public class WohnzimmerLichtEinBefehl implements Befehl {
	Licht licht;

	public WohnzimmerLichtEinBefehl(Licht licht) {
		this.licht = licht;
	}
	public void ausführen() {
		licht.ein();
	}
	public void rückgängig() {
		licht.aus();
	}
}
