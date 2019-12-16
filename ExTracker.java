import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ExTracker extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField3;
    private String fileName;
    static double calories=0.0;




    /**
     * Launch the application.
     */


    /**
     * Create the frame.
     */
    public ExTracker() {
        //this.mainDis = mainDis;
        //clicked = false;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBounds(100, 100, 513, 345);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblExTracker = new JLabel("Exercise Tracker");
        lblExTracker.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblExTracker.setBounds(18, 16, 250, 33);
        contentPane.add(lblExTracker);
        
        
        JLabel lblExType = new JLabel("Excercise Type:");
        lblExType.setBounds(18, 89, 120, 16);
        contentPane.add(lblExType);
        
       
        JLabel mins = new JLabel("Minutes:");
        mins.setBounds(18,117,149,16);
        contentPane.add(mins);
        
        JLabel lblCalories = new JLabel("Calories Burned:");
        lblCalories.setBounds(18, 155, 270, 16);
        contentPane.add(lblCalories);

        textField = new JTextField();
        textField.setBounds(214, 117, 130, 26);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(214, 155, 130, 26);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        textField3 = new JTextField();
        textField3.setBounds(214,89,130,26);
        contentPane.add(textField3);
        textField3.setColumns(10);
        
        JButton btnAddFood = new JButton("Add to Tracker");
        btnAddFood.setBounds(327, 200, 155, 29);
        btnAddFood.addActionListener(new ActionListener1());
        contentPane.add(btnAddFood);
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    class ActionListener1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
         String exType = textField3.getText();
         String numMins = textField.getText();
         String calsBurned = textField_1.getText();
         calories += Double.parseDouble(calsBurned);
         
         try(FileWriter writer = new FileWriter(fileName,true);
         BufferedWriter br = new BufferedWriter(writer);
         PrintWriter out = new PrintWriter(br)) {
         out.println("Exercise: "+exType);
         out.println("Minutes: "+numMins);
         out.println("Calories Burned: "+calsBurned);
         out.println("-----------------------");
     }
     catch(IOException er){
       System.out.print("err");
     }
     dispose();
        }
    }
}
