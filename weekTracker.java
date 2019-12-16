//not working completly
//will be able to pull up a file for each week of the month when this is incorporated into the GUI
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.io.*;
import java.util.Calendar; 


public class weekTracker extends JPanel{
  
  static BufferedReader calReader = null;
  static BufferedReader exReader = null;
  static double weeklyCals;
  static double weeklyEx;
  
  public weekTracker(){
  try{
    //reads file of caloric intake for each day
    calReader = new BufferedReader(new FileReader(OptionInfo.calFileName));
    String t = null;
    while((t = calReader.readLine())!=null){
      //adds to total weekly calories
      weeklyCals+=(Double.parseDouble(t));
    }
  }
  catch(FileNotFoundException ets){
    System.out.print("not found");
  }
  catch(IOException ets){
    System.out.print("Error");
  }
  //reads file of calories burned for each day
  try{
    exReader = new BufferedReader(new FileReader(OptionInfo.exFileName));
    String t2= null;
    while((t2 = exReader.readLine())!=null){
      weeklyEx+=Double.parseDouble(t2);
    }
  }
  catch(FileNotFoundException ety){
    System.out.print("not found");
  }
  catch(IOException ets){
    System.out.print("Error");
  }
  }
}