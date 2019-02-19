package headfirst.templatemethod.frame;

import java.awt.*;
import javax.swing.*;

public class MeinFrame extends JFrame {

	public MeinFrame(String titel) {
		super(titel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(300,300);
		this.setVisible(true);
	}

	public void paint(Graphics grafik) {
		super.paint(grafik);
		String msg = "Ich bin der König!!";
		grafik.drawString(msg, 100, 100);
	}

	public static void main(String[] args) {
		MeinFrame myFrame = new MeinFrame("Head First Design Patterns");
	}
}
