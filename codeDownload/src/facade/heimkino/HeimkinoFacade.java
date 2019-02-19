package headfirst.facade.heimkino;

public class HeimkinoFacade {
	Verstaerker verstärker;
	Tuner tuner;
	DvdSpieler dvd;
	CdSpieler cd;
	Beamer beamer;
	Beleuchtung beleuchtung;
	Leinwand leinwand;
	PopcornMaschine popcorn;
 
	public HeimkinoFacade(Verstaerker amp, 
				 Tuner tuner, 
				 DvdSpieler dvd, 
				 CdSpieler cd, 
				 Beamer beamer, 
				 Leinwand leinwand,
				 Beleuchtung beleuchtung,
				 PopcornMaschine popcorn) {
 
		this.verstärker = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.beamer = beamer;
		this.leinwand = leinwand;
		this.beleuchtung = beleuchtung;
		this.popcorn = popcorn;
	}
 
	public void filmSchauen(String film) {
		System.out.println("Machen Sie sich bereit, der Film fängt gleich an...");
		popcorn.ein();
		popcorn.starten();
		beleuchtung.dimmen(10);
		leinwand.runter();
		beamer.ein();
		beamer.breitwandModus();
		verstärker.ein();
		verstärker.setDvd(dvd);
		verstärker.setSurroundSound();
		verstärker.setLautstärke(5);
		dvd.ein();
		dvd.spielen(film);
	}
 
 
	public void filmBeenden() {
		System.out.println("Fahre Heimkino herunter ...");
		popcorn.aus();
		beleuchtung.ein();
		leinwand.hoch();
		beamer.aus();
		verstärker.aus();
		dvd.anhalten();
		dvd.auswerfen();
		dvd.aus();
	}

	public void listenToCd(String cdTitle) {
		System.out.println("Get ready for an audiopile experence...");
		beleuchtung.ein();
		verstärker.ein();
		verstärker.setLautstärke(5);
		verstärker.setCd(cd);
		verstärker.setStereoSound();
		cd.ein();
		cd.spielen(cdTitle);
	}

	public void endCd() {
		System.out.println("Shutting down CD...");
		verstärker.aus();
		verstärker.setCd(cd);
		cd.auswerfen();
		cd.aus();
	}

	public void listenToRadio(double frequency) {
		System.out.println("Tuning in the airwaves...");
		tuner.ein();
		tuner.setFrequenz(frequency);
		verstärker.ein();
		verstärker.setLautstärke(5);
		verstärker.setTuner(tuner);
	}

	public void endRadio() {
		System.out.println("Shutting down the tuner...");
		tuner.aus();
		verstärker.aus();
	}
}
