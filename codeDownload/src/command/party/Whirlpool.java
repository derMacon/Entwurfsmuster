package headfirst.command.party;

public class Whirlpool {
	boolean an;
	int temperatur;

	public Whirlpool() {
	}

	public void an() {
		an = true;
	}

	public void aus() {
		an = false;
	}

	public void zirkulieren() {
		if (an) {
			System.out.println("Whirlpool schäumt!");
		}
	}

	public void strahlerEin() {
		if (an) {
			System.out.println("Whirlpool-Strahler sind an");
		}
	}

	public void strahlerAus() {
		if (an) {
			System.out.println("Whirlpool-Strahler sind aus");
		}
	}

	public void setTemperatur(int temperatur) {
		if (temperatur > this.temperatur) {
			System.out.println("Whirlpool wird erhitzt auf kochende " + temperatur + " Grad");
		}
		else {
			System.out.println("Whirlpool wird abgekühlt auf " + temperatur + " Grad");
		}
		this.temperatur = temperatur;
	}
}
