import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class DisplayGain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayGain frame = new DisplayGain();
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
	public DisplayGain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalorieDisplay = new JLabel("CALORIE DISPLAY - Gain");
		lblCalorieDisplay.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 26));
		lblCalorieDisplay.setBounds(82, -12, 362, 61);
		contentPane.add(lblCalorieDisplay);
		
		JButton btnAddNewFood = new JButton("Add New Food");
		btnAddNewFood.setBounds(327, 243, 117, 29);
		contentPane.add(btnAddNewFood);
		
		JButton btnCalenderView = new JButton("Calender View");
		btnCalenderView.setBounds(6, 243, 117, 29);
		contentPane.add(btnCalenderView);
		
		JLabel lblFoodListFor = new JLabel("Food List for Today:");
		lblFoodListFor.setBounds(6, 151, 180, 16);
		contentPane.add(lblFoodListFor);
		
		JLabel lblTotalCaloriesFor = new JLabel("Total Calories for Today:");
		lblTotalCaloriesFor.setBounds(264, 47, 180, 16);
		contentPane.add(lblTotalCaloriesFor);
		
		JLabel lblUsedCalories = new JLabel("Remaining Calories");
		lblUsedCalories.setBounds(6, 77, 143, 16);
		contentPane.add(lblUsedCalories);
	}
}
