package headfirst.strategy;

public class MiniEntenSimulator1 {
 
	public static void main(String[] args) {
 
		Ente mallard = new StockEnte();
		mallard.tuQuaken();
		mallard.tuFliegen();
   
		Ente model = new ModellEnte();
		model.tuFliegen();
		model.setFlugVerhalten(new FliegtRaketenGetrieben());
		model.tuFliegen();

	}
}
