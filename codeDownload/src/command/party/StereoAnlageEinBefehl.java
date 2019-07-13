package headfirst.command.party;

public class StereoAnlageEinBefehl implements Befehl {
	StereoAnlage stereo;

	public StereoAnlageEinBefehl(StereoAnlage stereo) {
		this.stereo = stereo;
	}

	public void ausführen() {
		stereo.ein();
	}

	public void rückgängig() {
		stereo.aus();
	}
}
