import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class FoodTracker extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private String foodName;
    static double foodCalories=0.0;
    private boolean clicked;
    private DisplayLoss mainDis;
    /**
     * Launch the application.
     */


    /**
     * Create the frame.
     */
    public FoodTracker() {
        this.mainDis = mainDis;
        clicked = false;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBounds(100, 100, 513, 345);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblLoseTracker = new JLabel("Food Tracker");
        lblLoseTracker.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblLoseTracker.setBounds(18, 16, 183, 33);
        contentPane.add(lblLoseTracker);
        
        
        JLabel lblFoodName = new JLabel("Food Name:");
        lblFoodName.setBounds(18, 89, 89, 16);
        contentPane.add(lblFoodName);
        
        JLabel lblCaloriesPerServing = new JLabel("Calories:");
        lblCaloriesPerServing.setBounds(18, 117, 149, 16);
        contentPane.add(lblCaloriesPerServing);


        textField = new JTextField();
        textField.setBounds(214, 112, 130, 26);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(214, 84, 130, 26);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JButton btnAddFood = new JButton("Add to Tracker");
        btnAddFood.setBounds(327, 200, 155, 29);
        btnAddFood.addActionListener(new ActionListener1());
        contentPane.add(btnAddFood);
    }
    class ActionListener1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
         // try{
            String cals = textField.getText();
            String food = textField_1.getText();
            try{
            foodCalories += Double.parseDouble(cals);
            try(FileWriter writer = new FileWriter("newUser.txt",true);
                BufferedWriter br = new BufferedWriter(writer);
                PrintWriter out = new PrintWriter(br)) {
                  out.println("Food Eaten: "+food);
                  out.println("Calories: "+cals);
                  out.println("-----------------------");
                }
            catch(IOException er){
                  System.out.print("err");
                }
            }
            catch(NumberFormatException ee){
              JOptionPane.showMessageDialog(contentPane,"Calories must be numeric value");
            }
          
            
             dispose();
          }
       
          //catch(NumberFormatException ee){
          //  JOptionPane.showMessageDialog(contentPane,"Calories must be numeric value");
         // }
        }
    }
//}
