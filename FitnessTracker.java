
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FitnessTracker extends JPanel implements ActionListener{
 protected JLabel welcomeLabel;
 protected JButton cont;
 protected JFrame secondFrame;
      
 public FitnessTracker(){
   
     ImageIcon icon = createImageIcon("FitnessLogo.png","app logo");
     welcomeLabel = new JLabel("Welcome to FitnessTracker!",icon,JLabel.CENTER);
     welcomeLabel.setVerticalTextPosition(JLabel.BOTTOM);
     welcomeLabel.setHorizontalTextPosition(JLabel.CENTER);
     add(welcomeLabel);
     
     //continue button opens the BMI calculaote frame
     cont = new JButton("Continue");
     cont.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
       Information information = new Information();
       information.setVisible(true);
       
      }
     });
     /**
      * after clicking this button, will start the information frame. Then the user can type in their
      * basic information
      */
     add(cont);
                 
 }
    
    /** Returns an ImageIcon, or null if the path was invalid. 
            * copied from java source code doc*/
 protected static ImageIcon createImageIcon(String path, String description) {
     java.net.URL imgURL = FitnessTracker.class.getResource(path);
     if (imgURL != null) {
         return new ImageIcon(imgURL, description);
     } else {
         System.err.println("Couldn't find file: " + path);
         return null;
         }
 }
     
 @Override
 public void actionPerformed(ActionEvent event){
   secondFrame.pack();
   secondFrame.setVisible(true);
 }
    
}
