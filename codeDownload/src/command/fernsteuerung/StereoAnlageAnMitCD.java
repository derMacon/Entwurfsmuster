package headfirst.command.fernsteuerung;

public class StereoAnlageAnMitCD implements Befehl {
	StereoAnlage stereo;
 
	public StereoAnlageAnMitCD(StereoAnlage stereo) {
		this.stereo = stereo;
	}
 
	public void ausführen() {
		stereo.ein();
		stereo.setCD();
		stereo.setLautstärke(11);
	}
}
