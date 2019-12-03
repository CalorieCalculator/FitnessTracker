import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class LoseTracker extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoseTracker frame = new LoseTracker();
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
	public LoseTracker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoseTracker = new JLabel("Lose Tracker");
		lblLoseTracker.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblLoseTracker.setBounds(18, 16, 183, 33);
		contentPane.add(lblLoseTracker);
		
		JLabel lblFoodName = new JLabel("Food Name:");
		lblFoodName.setBounds(18, 89, 89, 16);
		contentPane.add(lblFoodName);
		
		JLabel lblCaloriesPerServing = new JLabel("Calories Per Serving ");
		lblCaloriesPerServing.setBounds(18, 117, 149, 16);
		contentPane.add(lblCaloriesPerServing);
		
		JLabel lblTypesOfExcersie = new JLabel("Miles Walked");
		lblTypesOfExcersie.setBounds(18, 145, 121, 16);
		contentPane.add(lblTypesOfExcersie);
		
		textField = new JTextField();
		textField.setBounds(214, 112, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(214, 84, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddFood = new JButton("Add Food");
		btnAddFood.setBounds(327, 243, 117, 29);
		contentPane.add(btnAddFood);
		
		textField_2 = new JTextField();
		textField_2.setBounds(214, 143, 130, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}