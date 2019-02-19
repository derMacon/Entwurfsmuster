package headfirst.state.kaugummizustand;

public class KaugummiAutomatTestlauf {

	public static void main(String[] args) {
		KaugummiAutomat kaugummiAutomat = new KaugummiAutomat(5);

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);
	}
}
