package headfirst.command.party;

public class StereoAnlageAusBefehl implements Befehl {
	StereoAnlage stereo;
 
	public StereoAnlageAusBefehl(StereoAnlage stereo) {
		this.stereo = stereo;
	}
 
	public void ausführen() {
		stereo.aus();
	}

	public void rückgängig() {
		stereo.ein();
	}
}
