import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BMIFrame extends JFrame {

	private JPanel contentPane;
	private JTextField weight;
	private JTextField height;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIFrame frame = new BMIFrame();
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
	public BMIFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBmiCalculator = new JLabel("BMI Calculator");
		lblBmiCalculator.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBmiCalculator.setBounds(144, 24, 160, 25);
		contentPane.add(lblBmiCalculator);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setBounds(62, 82, 46, 14);
		contentPane.add(lblWeight);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(62, 121, 46, 14);
		contentPane.add(lblHeight);
		
		weight = new JTextField();
		weight.setBounds(118, 79, 86, 20);
		contentPane.add(weight);
		weight.setColumns(10);
		
		height = new JTextField();
		height.setBounds(118, 118, 86, 20);
		contentPane.add(height);
		height.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(172, 180, 89, 23);
		contentPane.add(btnCalculate);
	}
}
