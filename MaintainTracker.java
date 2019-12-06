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

public class MaintainTracker extends JFrame {

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
					MaintainTracker frame = new MaintainTracker();
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
	public MaintainTracker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaintainTracker = new JLabel("Maintain Tracker");
		lblMaintainTracker.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblMaintainTracker.setBounds(18, 16, 232, 33);
		contentPane.add(lblMaintainTracker);
		
		JLabel lblFoodName = new JLabel("Food Name:");
		lblFoodName.setBounds(18, 75, 89, 16);
		contentPane.add(lblFoodName);
		
		JLabel lblCaloriesPerServing = new JLabel("Calories Per Serving ");
		lblCaloriesPerServing.setBounds(17, 103, 149, 16);
		contentPane.add(lblCaloriesPerServing);
		
		JLabel lblTypesOfExcersie = new JLabel("Types of Excersie ");
		lblTypesOfExcersie.setBounds(18, 131, 121, 16);
		contentPane.add(lblTypesOfExcersie);
		
		textField = new JTextField();
		textField.setBounds(214, 98, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(214, 70, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddFood = new JButton("Done");
		btnAddFood.setBounds(327, 243, 117, 29);
		contentPane.add(btnAddFood);
		
		JLabel lblNewLabel = new JLabel("Excersie Time");
		lblNewLabel.setBounds(18, 210, 99, 16);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(214, 205, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnRunning = new JRadioButton("Weight Training");
		rdbtnRunning.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rdbtnRunning.setBounds(189, 127, 141, 23);
		contentPane.add(rdbtnRunning);
		
		JRadioButton rdbtnYoga = new JRadioButton("Yoga");
		rdbtnYoga.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rdbtnYoga.setBounds(189, 150, 141, 23);
		contentPane.add(rdbtnYoga);
		
		JRadioButton rdbtnWalking = new JRadioButton("Walking");
		rdbtnWalking.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rdbtnWalking.setBounds(189, 173, 141, 23);
		contentPane.add(rdbtnWalking);
	}
}

