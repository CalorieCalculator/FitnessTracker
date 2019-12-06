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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		lblFoodName.setBounds(18, 73, 89, 16);
		contentPane.add(lblFoodName);
		
		JLabel lblCaloriesPerServing = new JLabel("Calories Per Serving ");
		lblCaloriesPerServing.setBounds(18, 101, 149, 16);
		contentPane.add(lblCaloriesPerServing);
		
		JLabel lblTypesOfExcersie = new JLabel("Types of Exercise");
		lblTypesOfExcersie.setBounds(18, 129, 121, 16);
		contentPane.add(lblTypesOfExcersie);
		
		textField = new JTextField();
		textField.setBounds(214, 96, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(214, 68, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddFood = new JButton("Done");
		btnAddFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddFood.setBounds(327, 243, 117, 29);
		contentPane.add(btnAddFood);
		
		JLabel lblNewLabel = new JLabel("Exercise Time");
		lblNewLabel.setBounds(18, 207, 99, 16);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnRunning = new JRadioButton("Running");
		rdbtnRunning.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rdbtnRunning.setBounds(193, 129, 141, 23);
		contentPane.add(rdbtnRunning);
		
		JRadioButton rdbtnSwimming = new JRadioButton("Swimming");
		rdbtnSwimming.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rdbtnSwimming.setBounds(193, 152, 141, 23);
		contentPane.add(rdbtnSwimming);
		
		JRadioButton rdbtnWeightTraining = new JRadioButton("Weight Training");
		rdbtnWeightTraining.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rdbtnWeightTraining.setBounds(193, 173, 141, 23);
		contentPane.add(rdbtnWeightTraining);
		
		textField_2 = new JTextField();
		textField_2.setBounds(214, 202, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}