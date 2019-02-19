package headfirst.combined.djview;
  
public class HerzTestlauf {

    public static void main (String[] args) {
		HerzModel herzModel = new HerzModel();
        ControllerInterface model = new HerzController(herzModel);
    }
}
