import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.text.DecimalFormat;
import java.io.*;


public class LoseTrackOptions extends JFrame {

 protected JPanel contentPane;
 protected JButton trackFood, trackEx;
 
  public LoseTrackOptions() {
    contentPane = new JPanel();
    contentPane.setLayout(new GridLayout(2,1));
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    contentPane.setBounds(100, 100, 200, 400);
    
    trackFood = new JButton("Track Food");
    trackFood.addActionListener(new Action1());
    
    trackEx = new JButton("Track Exercise");
    trackEx.addActionListener(new Action2());
    
    contentPane.add(trackFood);
    contentPane.add(trackEx);
    
    setContentPane(contentPane);
  }
 class Action1 implements ActionListener{
   public void actionPerformed(ActionEvent e){
     FoodTracker dl = new FoodTracker();
     dl.setBounds(100,100,513,345);
     dl.setVisible(true);
   }
 }
 class Action2 implements ActionListener{
   public void actionPerformed(ActionEvent e){
     ExTracker et = new ExTracker();
     et.setBounds(100,100,513,345);
     et.setVisible(true);
   }
 }
}
