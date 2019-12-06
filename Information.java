import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Information extends JFrame
{
    protected JButton button;
    protected JTextField textField;
    protected JTextField textField2;
    protected JTextField textField3;
    protected JTextField textField4;
    protected JTextField textField5;
    protected JTextField textField6;
    protected JTextField textField7;
    protected JTextField textField8;
    protected JTextField textField9;
    protected JLabel lable;
    protected JLabel lable2;
    protected JLabel lable3;
    protected JLabel lable4;
    protected JLabel lable5;
    protected JLabel lable6;
    protected JLabel lable7;
    protected JLabel lable8;
    protected JLabel lable9;
    private JTextArea resultArea;
    private JPanel panel;

    public Information()
    {
        resultArea = new JTextArea();
        resultArea.setEditable(true);
        creatTextField();
        creatTextField2();
        creatTextField3();
        creatTextField4();
        creatTextField5();
        creatTextField6();
        creatTextField7();
        creatTextField8();
        creatTextField9();
        creatButton();
        creatPanel();
        setSize(800,250);
    }
    private void creatTextField()
    {
        lable = new JLabel("First name :");
        final int Field_Width = 10;
        textField = new JTextField(Field_Width);
        textField.setText("");
    }
    private void creatTextField2()
    {
        lable2 = new JLabel("Last name :");
        final int Field_Width = 10;
        textField2 = new JTextField(Field_Width);
        textField2.setText("");
    }
    private void creatTextField3()
    {
        lable3 = new JLabel("Birthday :");
        final int Field_Width = 15;
        textField3 = new JTextField(Field_Width);
        textField3.setText("");
    }
    private void creatTextField4()
    {
        lable4 = new JLabel("Height :");
        final int Field_Width = 15;
        textField4 = new JTextField(Field_Width);
        textField4.setText("");
    }
    private void creatTextField5()
    {
        lable5 = new JLabel("Weight :");
        final int Field_Width = 15;
        textField5 = new JTextField(Field_Width);
        textField5.setText("");
    }
    private void creatTextField6()
    {
        lable6 = new JLabel("Goal Weight :");
        final int Field_Width = 15;
        textField6 = new JTextField(Field_Width);
        textField6.setText("");
    }
    private void creatTextField7()
    {
        lable7 = new JLabel("Gender :");
        final int Field_Width = 15;
        textField7 = new JTextField(Field_Width);
        textField7.setText("");
    }
    private void creatTextField8()
    {
        lable8 = new JLabel("Caloric intake :");
        final int Field_Width = 15;
        textField8 = new JTextField(Field_Width);
        textField8.setText("");
    }
    private void creatTextField9()
    {
        lable9 = new JLabel("Activity :");
        final int Field_Width = 15;
        textField9 = new JTextField(Field_Width);
        textField9.setText("");
    }
    private void creatButton(){
        button = new JButton(" Confirm");
        class AddNameListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {

                String nameFromTextBox = textField.getText();
                String lastNameTBox = textField2.getText();
                String bDay = textField3.getText();
                String glWeight = textField6.getText();
                String gndr = textField7.getText();
                String clrInt = textField8.getText();

                
                try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("newUser.txt"),"utf-8"))){
                  writer.write(nameFromTextBox+" ");
                  writer.write(lastNameTBox+ "\r\n");
                  writer.write("BirthDay: "+bDay+ "\r\n");

                  writer.write("Goal Weight: "+glWeight+ "\r\n");
                  writer.write("Gender: "+gndr+ "\r\n");
                  writer.write("Daily Caloric Inake: "+clrInt+"\r\n");
                  

                }
                catch (IOException ex){
                  System.out.println("error");
                }
                                                                            

                BMIFrame bmiInfo = new BMIFrame();
                bmiInfo.setVisible(true);
                dispose();
            }
        }
        button.addActionListener(new AddNameListener());

    }
    private void creatPanel()
    {
      panel = new JPanel();
        panel.setLayout(new GridLayout(9,2));
        panel.add(lable,BorderLayout.CENTER);
        panel.add(textField,BorderLayout.CENTER);
        panel.add(lable2,BorderLayout.CENTER);
        panel.add(textField2,BorderLayout.CENTER);
        panel.add(lable2,BorderLayout.CENTER);
        panel.add(textField2,BorderLayout.CENTER);
        panel.add(lable3,BorderLayout.CENTER);
        panel.add(textField3,BorderLayout.CENTER);
        //panel.add(lable4,BorderLayout.CENTER);
        // panel.add(textField4,BorderLayout.CENTER);
        // panel.add(lable5,BorderLayout.CENTER);
        //panel.add(textField5,BorderLayout.CENTER);
        panel.add(lable6,BorderLayout.CENTER);
        panel.add(textField6,BorderLayout.CENTER);
        panel.add(lable7,BorderLayout.CENTER);
        panel.add(textField7,BorderLayout.CENTER);
        panel.add(lable8,BorderLayout.CENTER);
        panel.add(textField8,BorderLayout.CENTER);
        JPanel infoP = new JPanel();
        infoP.setLayout(new BorderLayout());
        infoP.add(panel,BorderLayout.CENTER);
        infoP.add(button,BorderLayout.SOUTH);
        add(infoP);

    }
}
