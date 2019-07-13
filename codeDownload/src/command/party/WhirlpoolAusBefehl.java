package headfirst.command.party;

public class WhirlpoolAusBefehl implements Befehl {
	Whirlpool whirlpool;

	public WhirlpoolAusBefehl(Whirlpool whirlpool) {
		this.whirlpool = whirlpool;
	}

	public void ausführen() {
		whirlpool.setTemperatur(32);
		whirlpool.aus();
	}
	public void rückgängig() {
		whirlpool.an();
	}
}
