import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaintainTracker extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextArea textField_3;
    private String foodName;
    private double foodCalories;
    private boolean clicked;
    private DisplayMaintain mainDis;
    private double cB;
    /**
     * Launch the application.
     */


    /**
     * Create the frame.
     */
    public MaintainTracker(DisplayMaintain mainDis) {
        this.mainDis = mainDis;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblMaintainTracker = new JLabel("Maintain Tracker");
        lblMaintainTracker.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblMaintainTracker.setBounds(18, 16, 250, 33);
        contentPane.add(lblMaintainTracker);

        JLabel lblFoodName = new JLabel("Food Name:");
        lblFoodName.setBounds(18, 89, 89, 16);
        contentPane.add(lblFoodName);

        JLabel lblCaloriesPerServing = new JLabel("Calories Per Serving ");
        lblCaloriesPerServing.setBounds(18, 117, 149, 16);
        contentPane.add(lblCaloriesPerServing);

        JLabel lblTypesOfExcersie = new JLabel("Types of Excersie ");
        lblTypesOfExcersie.setBounds(18, 165, 121, 16);
        contentPane.add(lblTypesOfExcersie);

        textField = new JTextField();
        textField.setBounds(214, 112, 130, 26);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(214, 84, 130, 26);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JButton btnAddFood = new JButton("Done");
        btnAddFood.setBounds(327, 243, 117, 29);
        btnAddFood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foodName = textField_1.getText();
                foodCalories = Double.valueOf(textField.getText());
                double remaining =Double.parseDouble(mainDis.getCaloriesR().getText());
                mainDis.getFood().append(foodName+'\n');
                remaining = remaining - foodCalories;
                mainDis.getCaloriesR().setText(String.valueOf(remaining));
                mainDis.setVisible(true);
                dispose();
            }
        });
        contentPane.add(btnAddFood);
        JLabel lblExcersieTime = new JLabel("Excersie Time ");
        lblExcersieTime.setBounds(18, 145, 105, 16);
        contentPane.add(lblExcersieTime);

        textField_3 = new JTextArea();
        textField_3.setBounds(214, 145, 130, 23);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JRadioButton rdbtnWeightTraning = new JRadioButton("Weight training");
        rdbtnWeightTraning.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        rdbtnWeightTraning.setBounds(214, 165, 141, 23);
        rdbtnWeightTraning.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cB = 2.9 * Double.valueOf(textField_3.getText());
                mainDis.getExercise().append(rdbtnWeightTraning.getText()+" "+cB+" "+"cal"+" "+textField_3.getText()+"minutes"+'\n');
            }
        });
        contentPane.add(rdbtnWeightTraning);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("Yoga");
        rdbtnNewRadioButton.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        rdbtnNewRadioButton.setBounds(214, 195, 141, 23);
        rdbtnNewRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cB = 1.7 * Double.valueOf(textField_3.getText());
                mainDis.getExercise().append(rdbtnWeightTraning.getText()+" "+cB+" "+"cal"+" "+textField_3.getText()+"minutes"+'\n');
            }
        });
        contentPane.add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Wallking");
        rdbtnNewRadioButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        rdbtnNewRadioButton_1.setBounds(214, 225, 141, 23);
        rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cB = 2.4 * Double.valueOf(textField_3.getText());
                mainDis.getExercise().append(rdbtnWeightTraning.getText()+" "+cB+" "+"cal"+" "+textField_3.getText()+"minutes"+'\n');
            }
        });
        contentPane.add(rdbtnNewRadioButton_1);
    }

}