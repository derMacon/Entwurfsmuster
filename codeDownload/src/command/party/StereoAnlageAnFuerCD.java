package headfirst.command.party;

public class StereoAnlageAnFuerCD implements Befehl {
	StereoAnlage stereo;
 
	public StereoAnlageAnFuerCD(StereoAnlage stereo) {
		this.stereo = stereo;
	}
 
	public void ausführen() {
		stereo.ein();
		stereo.setCD();
		stereo.setLautstärke(11);
	}

	public void rückgängig() {
		stereo.aus();
	}
}
