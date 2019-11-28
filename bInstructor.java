import javax.swing.*;
import java.awt.*;

public class bInstructor extends JFrame {
    private JFrame instructor;
    private JButton loseWeight,gainweight,maintainWeight;
    private JTextArea bmiText1;
    private JPanel panel;
    public bInstructor(){

        bmiText1 = new JTextArea("BMI VALUES\n Underweight: Under 18.5\n Normal: 18.5-24.9\n Overweight: 25-29.9\n Obese: 30 or over");
        loseWeight = new JButton("Lose");
        gainweight = new JButton("Gain");
        maintainWeight = new JButton("Maintain");
        panel = new JPanel();
        setBounds(100, 100, 450, 500);
        bmiText1.setEditable(false);
        panel.setLayout(new BorderLayout());
        panel.add(bmiText1,BorderLayout.NORTH);
        panel.add(loseWeight,BorderLayout.CENTER);
        panel.add(gainweight,BorderLayout.CENTER);
        panel.add(maintainWeight,BorderLayout.CENTER);
        add(panel);
    }

}
