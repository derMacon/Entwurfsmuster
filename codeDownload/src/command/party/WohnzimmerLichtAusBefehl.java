package headfirst.command.party;

public class WohnzimmerLichtAusBefehl implements Befehl {
	Licht licht;

	public WohnzimmerLichtAusBefehl(Licht licht) {
		this.licht = licht;
	}
	public void ausführen() {
		licht.aus();
	}
	public void rückgängig() {
		licht.ein();
	}
}
