import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoseTracker extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private String foodName;
    private double foodCalories;
    private boolean clicked;
    private DisplayLoss mainDis;
    /**
     * Launch the application.
     */


    /**
     * Create the frame.
     */
    public LoseTracker() {
        this.mainDis = mainDis;
        clicked = false;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBounds(100, 100, 513, 345);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblLoseTracker = new JLabel("Lose Tracker");
        lblLoseTracker.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblLoseTracker.setBounds(18, 16, 183, 33);
        contentPane.add(lblLoseTracker);

        JLabel lblFoodName = new JLabel("Food Name:");
        lblFoodName.setBounds(18, 89, 89, 16);
        contentPane.add(lblFoodName);

        JLabel lblCaloriesPerServing = new JLabel("Calories Per Serving ");
        lblCaloriesPerServing.setBounds(18, 117, 149, 16);
        contentPane.add(lblCaloriesPerServing);

        JLabel lblTypesOfExcersie = new JLabel("Miles Walked");
        lblTypesOfExcersie.setBounds(18, 145, 121, 16);
        contentPane.add(lblTypesOfExcersie);

        textField = new JTextField();
        textField.setBounds(214, 112, 130, 26);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(214, 84, 130, 26);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JButton btnAddFood = new JButton("Add Food");
        btnAddFood.setBounds(327, 243, 117, 29);
        btnAddFood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               foodName = textField_1.getText();
               foodCalories = Double.valueOf(textField.getText());
               double remaining =Double.parseDouble(mainDis.getLblCalorieslistForText().getText());
                mainDis.getLblFoodlistForText().append(foodName+'\n');
                remaining = remaining - foodCalories;
                mainDis.getLblCalorieslistForText().setText(String.valueOf(remaining));
                mainDis.setVisible(true);
                dispose();
            }
        });
        contentPane.add(btnAddFood);

        textField_2 = new JTextField();
        textField_2.setBounds(214, 143, 130, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodCalories() {
        return foodCalories;
    }

    public void setFoodCalories(double foodCalories) {
        this.foodCalories = foodCalories;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }
}