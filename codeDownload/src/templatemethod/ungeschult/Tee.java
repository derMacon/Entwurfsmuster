package headfirst.templatemethod.ungeschult;

	public class Tee {
	 
		void zubereitungsRezept() {
			kocheWasser();
			teebeutelZiehenLassen();
			inTasseSchütten();
			zitroneHinzufügen();
		}
	 
		public void kocheWasser() {
			System.out.println("Koche Wasser");
		}
	 
		public void teebeutelZiehenLassen() {
			System.out.println("Lasse Tee ziehen");
		}
	 
		public void zitroneHinzufügen() {
			System.out.println("Füge Zitrone hinzu");
		}
	 
		public void inTasseSchütten() {
			System.out.println("Schütte in Tasse");
		}
}
