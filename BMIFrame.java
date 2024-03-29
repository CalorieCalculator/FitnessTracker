import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.text.DecimalFormat;
import java.io.*;
import java.util.*;

public class BMIFrame extends JFrame {

 protected JPanel contentPane;
 protected JTextField weight;
 protected JTextField height;
 protected JTextField inches;
 protected double BMI;
 protected JButton btnCalculate, learnMore, option;
 protected String fileName;
 private static DecimalFormat df = new DecimalFormat("00.0");
 /**
  * Launch the application.
  */
/* public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     BMIFrame frame = new BMIFrame();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }*/

 /**
  * Create the frame.
  */
 
 public BMIFrame() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 450, 500);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JLabel lblBmiCalculator = new JLabel("BMI Calculator");
  lblBmiCalculator.setFont(new Font("Tahoma", Font.BOLD, 20));
  lblBmiCalculator.setBounds(144, 24, 160, 25);
  contentPane.add(lblBmiCalculator);
  
  JLabel lblWeight = new JLabel("Weight(lbs):");
  lblWeight.setBounds(60, 82, 100, 14);
  contentPane.add(lblWeight);
  
  JLabel lblHeight = new JLabel("Height: Feet");
  lblHeight.setBounds(62, 121, 100, 14);
  contentPane.add(lblHeight);
  
  JLabel lblInches = new JLabel("Inches");
  lblInches.setBounds(195,121,45,14);
  contentPane.add(lblInches);
  

  
  weight = new JTextField();
  weight.setBounds(130, 79, 86, 20);
  contentPane.add(weight);
  weight.setColumns(10);
  
  height = new JTextField();
  height.setBounds(138, 118, 35, 20);
  contentPane.add(height);
  height.setColumns(10);
  
  inches = new JTextField();
  inches.setBounds(240,118,35,20);
  contentPane.add(inches);
  inches.setColumns(10);
  
  
 

  btnCalculate = new JButton("Calculate");
  btnCalculate.addActionListener(new Action1()); 
  contentPane.add(btnCalculate);
  btnCalculate.setBounds(172, 180, 89, 23);
  
 }

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName){
     this.fileName = fileName;
    }

    class Action1 implements ActionListener{
   public void actionPerformed(ActionEvent e){
     try{
       Double weightFromText = Double.parseDouble(weight.getText());
       Double feetFromText = Double.parseDouble(height.getText());
       Double inchesFromText = Double.parseDouble(inches.getText());
       Double heightInInches = ((feetFromText*12)+inchesFromText);
       Double BMI = ((weightFromText*703)/(heightInInches*heightInInches));
       String x = df.format(BMI);
       Calendar calendar = Calendar.getInstance();
       try(FileWriter writer = new FileWriter(fileName,true);
         BufferedWriter br = new BufferedWriter(writer);
         PrintWriter out = new PrintWriter(br)) {
           out.println("Date:"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.DAY_OF_MONTH)+"/"+calendar.get(Calendar.YEAR));
           out.println("Week of this month:"+calendar.get(Calendar.WEEK_OF_MONTH));
         out.println("BMI: "+x);
         out.println("-----------------------");
     }
     catch(IOException er){
       System.out.print("err");
     }

     
     JLabel yourBMI = new JLabel("BMI:");
     yourBMI.setBounds(315,70,100,100);
     yourBMI.setFont(yourBMI.getFont().deriveFont(35.0f));
     contentPane.add(yourBMI);

     JLabel bmiLabel = new JLabel("");
     bmiLabel.setBounds(315,105,100,100);
     bmiLabel.setFont(bmiLabel.getFont().deriveFont(45.0f));
     contentPane.add(bmiLabel);
     bmiLabel.setText(x);
     
     learnMore = new JButton("Learn More");
     learnMore.addActionListener(new Action2());//change action
     contentPane.add(learnMore);
     learnMore.setBounds(315,220,100,30);
       
     option = new JButton("Continue");
     option.addActionListener(new Action3());
     contentPane.add(option);
     option.setBounds(315,245,100,30);
       
     }
     catch(NumberFormatException ee){
       JOptionPane.showMessageDialog(contentPane,"all inputs must be numbers");
       
     }



   }
   
 }
 class Action2 implements ActionListener{
   public void actionPerformed(ActionEvent e){
    bInstructor instructor = new bInstructor();
    instructor.setVisible(true);
   }
 }
 
 class Action3 implements ActionListener{
  public void actionPerformed(ActionEvent e) {
   OptionInfo info = new OptionInfo();
   info.setFileName(fileName);
   info.setVisible(true);
   dispose();
  }
 }
 
}