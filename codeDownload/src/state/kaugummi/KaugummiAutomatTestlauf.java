package headfirst.state.kaugummi;

public class KaugummiAutomatTestlauf {

	public static void main(String[] args) {
		KaugummiAutomat kaugummiAutomat = new KaugummiAutomat(5);

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.münzeAuswerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.münzeAuswerfen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.münzeEinwerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);
	}
}
