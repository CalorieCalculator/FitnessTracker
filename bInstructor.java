import javax.swing.*;
import java.awt.*;

public class bInstructor extends JFrame {
    private JTextArea bmiText1;
    private JPanel panel;
    
    public bInstructor(){

        bmiText1 = new JTextArea("BMI VALUES\n Underweight: Under 18.5\n Normal: 18.5-24.9\n Overweight: 25-29.9\n Obese: 30 or over");
        bmiText1.setEditable(false);
        panel = new JPanel();
        setBounds(100, 100, 430, 313);
        bmiText1.setEditable(false);
        panel.setLayout(new BorderLayout());
        panel.add(bmiText1,BorderLayout.CENTER);
        getContentPane().add(panel);
    }

}


