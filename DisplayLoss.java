import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DisplayLoss extends JFrame {

	private JPanel contentPane;
	private JTextArea lblFoodlistForText;
	private JTextArea lblCalorieslistForText;
	private JTextArea totalCalories;
	private JTextArea Exercise;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		DisplayLoss frame = new DisplayLoss();
		frame.setVisible(true);

	}

	public JTextArea getLblFoodlistForText() {
		return lblFoodlistForText;
	}

	public void setLblFoodlistForText(JTextArea lblFoodlistForText) {
		this.lblFoodlistForText = lblFoodlistForText;
	}

	public JTextArea getLblCalorieslistForText() {
		return lblCalorieslistForText;
	}

	public void setLblCalorieslistForText(JTextArea lblCalorieslistForText) {
		this.lblCalorieslistForText = lblCalorieslistForText;
	}

	/**
	 * Create the frame.
	 */

	public DisplayLoss() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		lblFoodlistForText = new JTextArea();
		lblCalorieslistForText = new JTextArea();
		totalCalories = new JTextArea();




		JLabel lblCalorieDisplay = new JLabel("CALORIE DISPLAY - Loss");
		lblCalorieDisplay.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 26));
		lblCalorieDisplay.setBounds(55, -13, 362, 61);
		contentPane.add(lblCalorieDisplay);
		
		JButton btnAddNewFood = new JButton("Add New Food");
		btnAddNewFood.setBounds(327, 243, 117, 29);
		btnAddNewFood.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openLoseTracker();
				dispose();
			}
		});
		contentPane.add(btnAddNewFood);
		
		JButton btnCalenderView = new JButton("Calender View");
		btnCalenderView.setBounds(6, 243, 117, 29);
		contentPane.add(btnCalenderView);
		
		JLabel lblFoodListFor = new JLabel("Food List for Today:");
		lblFoodListFor.setBounds(6, 151, 180, 16);
		contentPane.add(lblFoodListFor);

		lblFoodlistForText.setBounds(6,180,200,50);
		lblFoodlistForText.setEditable(false);
		contentPane.add(lblFoodlistForText);

		lblCalorieslistForText.setBounds(6,120,117,29);
		lblCalorieslistForText.setEditable(false);
		lblCalorieslistForText.setText("1750");
		contentPane.add(lblCalorieslistForText);

		JLabel lblTotalCaloriesFor = new JLabel("Total Calories for Today:");
		lblTotalCaloriesFor.setBounds(264, 47, 180, 16);
		contentPane.add(lblTotalCaloriesFor);


		totalCalories.setBounds(264,80,117,29);
		totalCalories.setEditable(false);
		totalCalories.setText("1750");
		contentPane.add(totalCalories);
		
		JLabel lblUsedCalories = new JLabel("Remaining Calories");
		lblUsedCalories.setBounds(6, 93, 143, 16);
		contentPane.add(lblUsedCalories);
		
		JButton btnInformationPage = new JButton("Information Page ");
		btnInformationPage.setBounds(145, 243, 155, 29);
		btnInformationPage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Informational information = new Informational();
				information.setVisible(true);

			}
		});
		contentPane.add(btnInformationPage);

		setContentPane(contentPane);
		setBounds(100, 100, 900, 600);
	}
	public void openLoseTracker(){
		LoseTracker loseTracker = new LoseTracker(this);
		loseTracker.setVisible(true);
	}

}
