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
       
       cont = new JButton("Continue");
       

       cont.addActionListener(this);//instead of this make new actionlistener class for this frame
       add(cont);
       
       
       
       
       
     }
   
         /** Returns an ImageIcon, or null if the path was invalid. 
           * copied from java source code doc*/
    protected static ImageIcon createImageIcon(String path,
                                               String description) {
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