import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayGain extends JFrame {

 private JPanel contentPane;
 private JTextArea food;
 private JTextArea caloriesR;
 private JTextArea TotalColories;
 private JTextArea Exercise;
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

 public JTextArea getFood() {
  return food;
 }

 public JTextArea getCaloriesR() {
  return caloriesR;
 }

 public JTextArea getExercise() { return Exercise; }

 /**
  * Create the frame.
  */

 public DisplayGain() {
  food = new JTextArea();
  caloriesR = new JTextArea();
  TotalColories = new JTextArea();
  Exercise = new JTextArea();
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 492, 316);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);


  
  JLabel lblCalorieDisplay = new JLabel("CALORIE DISPLAY - Gain");
  lblCalorieDisplay.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 26));
  lblCalorieDisplay.setBounds(46, -16, 362, 61);
  contentPane.add(lblCalorieDisplay);
  
  JButton btnAddNewFood = new JButton("Add New Food");
  btnAddNewFood.setBounds(327, 243, 117, 29);
  btnAddNewFood.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) {
    openGainTracker();
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

  food.setBounds(6,180,117,50);
  contentPane.add(food);
  
  JLabel lblTotalCaloriesFor = new JLabel("Total Calories for Today:");
  lblTotalCaloriesFor.setBounds(264, 47, 180, 16);
  contentPane.add(lblTotalCaloriesFor);

  TotalColories.setText("2750");
  TotalColories.setBounds(264, 80, 180, 16);
  contentPane.add(TotalColories);
  
  JLabel lblUsedCalories = new JLabel("Remaining Calories");
  lblUsedCalories.setBounds(6, 93, 143, 16);
  contentPane.add(lblUsedCalories);

  caloriesR.setText("2750");
  caloriesR.setBounds(6,120,117,29);
  contentPane.add(caloriesR);

  JLabel exercisesT = new JLabel("Exercises List for today");
  exercisesT.setBounds(250, 151, 220, 16);
  contentPane.add(exercisesT);

  Exercise.setBounds(250,180,230,29);
  contentPane.add(Exercise);

  JButton btnInformationPage = new JButton("Information Page ");
  btnInformationPage.setBounds(145, 243, 155, 29);
  contentPane.add(btnInformationPage);
  btnInformationPage.addActionListener(new ActionListener () {
   public void actionPerformed2(ActionEvent e) {
    Information informations = new Information();
    informations.setVisible(true);
   }
  

   @Override
   public void actionPerformed(ActionEvent e) {
    Information information = new Information();
    information.setVisible(true);
    
   }
  });
  
 }
 public void openGainTracker(){
  GainTracker gainTracker = new GainTracker(this);
  gainTracker.setVisible(true);
 }
}
