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
import javax.swing.JRadioButton;

public class GainTracker extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GainTracker frame = new GainTracker();
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
	public GainTracker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGainTracker = new JLabel("Gain Tracker");
		lblGainTracker.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblGainTracker.setBounds(18, 16, 183, 33);
		contentPane.add(lblGainTracker);
		
		JLabel lblFoodName = new JLabel("Food Name:");
		lblFoodName.setBounds(18, 71, 89, 16);
		contentPane.add(lblFoodName);
		
		JLabel lblCaloriesPerServing = new JLabel("Calories Per Serving ");
		lblCaloriesPerServing.setBounds(18, 99, 149, 16);
		contentPane.add(lblCaloriesPerServing);
		
		JLabel lblTypesOfExcersie = new JLabel("Types of Excersie ");
		lblTypesOfExcersie.setBounds(18, 134, 121, 16);
		contentPane.add(lblTypesOfExcersie);
		
		textField = new JTextField();
		textField.setBounds(214, 99, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(214, 66, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddFood = new JButton("Done");
		btnAddFood.setBounds(327, 243, 117, 29);
		contentPane.add(btnAddFood);
		
		JLabel lblExcersieTime = new JLabel("Excersie Time ");
		lblExcersieTime.setBounds(18, 215, 105, 16);
		contentPane.add(lblExcersieTime);
		
		textField_3 = new JTextField();
		textField_3.setBounds(214, 210, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnWeightTraning = new JRadioButton("Weight Training");
		rdbtnWeightTraning.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rdbtnWeightTraning.setBounds(189, 135, 141, 23);
		contentPane.add(rdbtnWeightTraning);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Jogging");
		rdbtnNewRadioButton.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(189, 156, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Walking");
		rdbtnNewRadioButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(189, 180, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1);
	}
}