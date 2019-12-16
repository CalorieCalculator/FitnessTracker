//part of program not fully implemented into GUI
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class GainTracker extends JFrame {

 private JPanel contentPane;
 private JTextField textField;
 private JTextField textField_1;
 private String foodName;
 private double foodCalories;
 private boolean clicked;
 private DisplayGain mainDis;
 /**
  * Launch the application.
  */


 /**
  * Create the frame.
  */
 public GainTracker() {
  this.mainDis = mainDis;
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
  lblFoodName.setBounds(18, 89, 89, 16);
  contentPane.add(lblFoodName);
  
  JLabel lblCaloriesPerServing = new JLabel("Calories Per Serving ");
  lblCaloriesPerServing.setBounds(18, 117, 149, 16);
  contentPane.add(lblCaloriesPerServing);
  
  JLabel lblTypesOfExcersie = new JLabel("Types of Excersie ");
  lblTypesOfExcersie.setBounds(18, 145, 121, 16);
  contentPane.add(lblTypesOfExcersie);
  
  JComboBox comboBox = new JComboBox();
  comboBox.setBounds(272, 141, 52, 27);
  contentPane.add(comboBox);
  
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
  btnAddFood.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) {
     //getting information from text box
    foodName = textField_1.getText();
    foodCalories = Double.valueOf(textField.getText());
    //calculates remaining calories for day
    double remaining =Double.parseDouble(mainDis.getCaloriesR().getText());
    //adds food name to display
    mainDis.getFood().append(foodName+'\n');
    remaining = remaining - foodCalories;
    //sets remaining calorie values for day based on current intake
    mainDis.getCaloriesR().setText(String.valueOf(remaining));
    mainDis.setVisible(true);
    dispose();
   }
  });
  contentPane.add(btnAddFood);
 }

 public String getFoodName() {
  return foodName;
 }

 public void setFoodName(String foodName) {
  this.foodName = foodName;
 }

 public double getFoodCalories() {
  return foodCalories;
 }

 public void setFoodCalories(double foodCalories) {
  this.foodCalories = foodCalories;
 }
}
