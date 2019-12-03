import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class bInstructor extends JFrame {
	private JTextArea bmiText1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bInstructor frame = new bInstructor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bInstructor() {
		bmiText1 = new JTextArea("BMI VALUES\n Underweight: Under 18.5\n Normal: 18.5-24.9\n Overweight: 25-29.9\n Obese: 30 or over");
        
	}

}
