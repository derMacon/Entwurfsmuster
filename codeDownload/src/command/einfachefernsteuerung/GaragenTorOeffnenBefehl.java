package headfirst.command.einfachefernsteuerung;

public class GaragenTorOeffnenBefehl implements Befehl {
	GaragenTor garagenTor;

	public GaragenTorOeffnenBefehl(GaragenTor garagenTor) {
		this.garagenTor = garagenTor;
	}

	public void ausführen() {
		garagenTor.hoch();
	}
}
