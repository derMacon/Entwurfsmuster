package headfirst.facade.heimkino;

public class HeimkinoTestlauf {
	public static void main(String[] args) {
		Verstaerker verstärker = new Verstaerker("Super Verstärker");
		Tuner tuner = new Tuner("Super AM/FM-Tuner", verstärker);
		DvdSpieler dvd = new DvdSpieler("Super DVD-Spieler", verstärker);
		CdSpieler cd = new CdSpieler("Super CD-Spieler", verstärker);
		Beamer beamer = new Beamer("Super Beamer", dvd);
		Beleuchtung beleuchtung = new Beleuchtung("Kino-Beleuchtung");
		Leinwand leinwand = new Leinwand("Kino-Leinwand");
		PopcornMaschine popcorn = new PopcornMaschine("Poppi");
 
		HeimkinoFacade homeTheater = 
				new HeimkinoFacade(verstärker, tuner, dvd, cd, 
						beamer, leinwand, beleuchtung, popcorn);
 
		homeTheater.filmSchauen("Million Dollar Baby");
		homeTheater.filmBeenden();
	}
}
