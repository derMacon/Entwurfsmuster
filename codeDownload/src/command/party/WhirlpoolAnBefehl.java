package headfirst.command.party;

public class WhirlpoolAnBefehl implements Befehl {
	Whirlpool whirlpool;

	public WhirlpoolAnBefehl(Whirlpool whirlpool) {
		this.whirlpool = whirlpool;
	}
	public void ausführen() {
		whirlpool.an();
		whirlpool.setTemperatur(35);
		whirlpool.zirkulieren();
	}
	public void rückgängig() {
		whirlpool.aus();
	}
}
