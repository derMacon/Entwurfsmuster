package headfirst.observer.Swing;
	
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
	
public class SwingObserverBeispiel {
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverBeispiel beispiel = new SwingObserverBeispiel();
		beispiel.go();
	}
	
	public void go() {
		frame = new JFrame();

		JButton button = new JButton("Soll ich es tun?");
		button.addActionListener(new EngelListener());
		button.addActionListener(new TeufelListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);

		// Frame-Properties setzen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	class EngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Tu es nicht, du könntest es bereuen!");
		}
	}

	class TeufelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Los, mach es!");
		}
	}
}
