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

//lets you select from maintain, lose or gain weight
public class OptionInfo extends JFrame {

 private JPanel contentPane;
 protected String line = null;
 static String fileName, calFileName, exFileName;
 protected double weeklyCals=0;
 protected double weeklyEx=0;
 
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     OptionInfo frame = new OptionInfo();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the frame.
  */
 public OptionInfo() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 513, 345);
  
  JMenuBar menuBar = new JMenuBar();
  setJMenuBar(menuBar);
  
  JMenu mnTrackGain = new JMenu("Track");
  mnTrackGain.setHorizontalAlignment(SwingConstants.LEFT);
  mnTrackGain.setFont(new Font("Segoe UI", Font.BOLD, 15));
  menuBar.add(mnTrackGain);
  
  JMenuItem mntmTrackGain = new JMenuItem("Track Gain");
  mntmTrackGain.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    LoseTrackOptions lose = new LoseTrackOptions();
    lose.setFileName(fileName);
    lose.setBounds(100, 100, 513, 345);
    lose.setVisible(true);
    
    try(FileWriter writer = new FileWriter(fileName,true);
         BufferedWriter br = new BufferedWriter(writer);
         PrintWriter out = new PrintWriter(br)) {
         out.println("Goal is to Gain Weight!");
         out.println("Remember: Eat 4-5 meals a day, A high protein diet helps");
         out.println("Exercise goal is to add muscle mass");
         out.println("Make sure to excecise daily to burn fat and gain muscle");
         out.println("---------------------------------");
     }
     catch(IOException er){
       System.out.print("err");
     }    
   }
  });
  mnTrackGain.add(mntmTrackGain);
  
  JMenuItem mntmTrackLose = new JMenuItem("Track Lose");
  mntmTrackLose.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    LoseTrackOptions lose = new LoseTrackOptions();
    lose.setFileName(fileName);
    lose.setBounds(100, 100, 513, 345);
    lose.setVisible(true);
    
     try(FileWriter writer = new FileWriter(fileName,true);
         BufferedWriter br = new BufferedWriter(writer);
         PrintWriter out = new PrintWriter(br)) {
         out.println("Goal is to Lose Weight!");
         out.println("Remember: Avoid Sugar, Eat as many greens possible, drinks LOTS of water!");
         out.println("Exercise goal is to burn more than you eat");
         out.println("Ensure you're getting your heart rate up for atleast an hour a day");
         out.println("-----------------------");
     }
     catch(IOException er){
       System.out.print("err");
     }    
    
   }
  });
  mnTrackGain.add(mntmTrackLose);
  
  JMenuItem mntmTrackMaintain = new JMenuItem("Track Maintain");
  mntmTrackMaintain.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    LoseTrackOptions lose = new LoseTrackOptions();
    lose.setFileName(fileName);
    lose.setBounds(100, 100, 513, 345);
    lose.setVisible(true);
    
     try(FileWriter writer = new FileWriter(fileName,true);
         BufferedWriter br = new BufferedWriter(writer);
         PrintWriter out = new PrintWriter(br)) {
         out.println("Goal is to Maintain Weight!");
         out.println("Remember: Drinks lots of water, keep a balanced diet");
         out.println("Exercise often but do not over work yourself");
         out.println("Monitor your weight frequently to know your weight range");
         out.println("-----------------------");
     }
     catch(IOException er){
       System.out.print("err");
     }    
    
   }
   
  });
  mnTrackGain.add(mntmTrackMaintain);
  
  
  JMenuItem opnTrkr = new JMenuItem("Open Tracker");

  opnTrkr.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
     try{
       ProcessBuilder pb = new ProcessBuilder("Notepad.exe",fileName);
       pb.start();
     }
     catch(IOException ecp){
       System.out.println("Err");
     }
   }
  });
  mnTrackGain.add(opnTrkr);
  
  JMenuItem calTrkr = new JMenuItem("Cal Tracker");
  calTrkr.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
     
     JFrame calFr = new JFrame("Calorie Tracker");
     calFr.setSize(250,250);
     
     JLabel calDisp = new JLabel("Calories Eaten: ");
     calDisp.setBounds(30,5,200,100);
     calFr.add(calDisp);
     
     JLabel callabel = new JLabel("");
     callabel.setBounds(130,5,200,100);
     callabel.setFont(callabel.getFont().deriveFont(20.0f));
     calFr.add(callabel);
     
     JLabel calsBurned = new JLabel("Calories Burned:");
     calsBurned.setBounds(30,50,200,100);
     calFr.add(calsBurned);
     
     JLabel burnLabel = new JLabel("");
     calFr.setLayout(null);
     burnLabel.setBounds(130,50,200,100);
     burnLabel.setFont(callabel.getFont().deriveFont(20.0f));
     calFr.add(burnLabel);
     
     callabel.setText(Double.toString(FoodTracker.foodCalories));
     calFr.setVisible(true);

     
     burnLabel.setText(Double.toString(ExTracker.calories));
     
                         
   }
     
  });
  mnTrackGain.add(calTrkr);
  
  
  JMenuItem endDay = new JMenuItem("End Day");
  endDay.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
     
     calFileName = Information.nameFromTextBox+"_cals.txt";
     exFileName = Information.nameFromTextBox+"exercise.txt";
     File calFile = new File(calFileName);
     File exFile = new File(exFileName);
     
     if(calFile.exists()){
       try(FileWriter writer = new FileWriter(calFileName,true);
           BufferedWriter br2 = new BufferedWriter(writer);
           PrintWriter out2 = new PrintWriter(br2)){
                  out2.println(Double.toString(FoodTracker.foodCalories));

           }
           catch(IOException er){
                  System.out.print("err");
                }
       try(FileWriter writer2 = new FileWriter(exFileName,true);
     
           BufferedWriter br3 = new BufferedWriter(writer2);
           PrintWriter out3 = new PrintWriter(br3)){
                  out3.println(Double.toString(ExTracker.calories));

           }
           catch(IOException er){
                  System.out.print("err");
                }
             

     }
     else{
                    try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(calFile), "utf-8"))) {
                        writer.write(Double.toString(FoodTracker.foodCalories));  
                        writer.write("\n");
                        
                    } 
                    catch (IOException ex) {
                        System.out.println("error");
                    }
                    try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(exFile), "utf-8"))) {
                        writer.write(Double.toString(ExTracker.calories)); 
                        writer.write("\n");
                        
                }
                    catch (IOException ex) {
                        System.out.println("error");
                    }
                
       
    
 
    
   }
     
    dispose();
   }
   
  });
  mnTrackGain.add(endDay);
  

                     
  /*Calendar calendar2 = Calendar.getInstance();
  JMenuItem progress = new JMenuItem("Weekly Progress");
  progress.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {

     String weekNo = Integer.toString(calendar2.get(Calendar.WEEK_OF_MONTH));
     String progFileName = Information.nameFromTextBox+weekNo+".txt";
     
     File weekProg = new File(progFileName);
     
                if(weekProg.exists()){
                  

                }
                else {
                    try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(weekProg), "utf-8"))) {
                        writer.write("Weekly Calories: "+ weekTracker.weeklyCals);
                        writer.write("Weekly Calories Burned: "+ weekTracker.weeklyEx);

                    } catch (IOException ex) {
                        System.out.println("error");
                    }
                }    
    
   }
   
  });
  mnTrackGain.add(progress);*/
  
  
           
  
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  
  JLabel lblGain = new JLabel("Gain");
  lblGain.setFont(new Font("Tahoma", Font.PLAIN, 20));
  
  JLabel lblLose = new JLabel("Lose");
  lblLose.setFont(new Font("Tahoma", Font.PLAIN, 20));
  
  JLabel lblMaintain = new JLabel("Maintain");
  lblMaintain.setFont(new Font("Tahoma", Font.PLAIN, 20));
  
  JTextArea txtrIfYouWant = new JTextArea();
  txtrIfYouWant.setEditable(false);
  txtrIfYouWant.setBackground(SystemColor.controlHighlight);
  txtrIfYouWant.setFont(new Font("Tahoma", Font.PLAIN, 11));
  txtrIfYouWant.setWrapStyleWord(true);
  txtrIfYouWant.setText("If you want to gain weight, here are a few things to do:\r\n  ~Dont't skip a meal (have 4-5 meals/day)\r\n  ~Increase protein-rich foods and carb intake\r\n  ~Eat dense fruit and veggies (bannan, apple, carror, corn...)\r\n  ~Begin weight training");
  
  JTextArea txtrHereAreSome = new JTextArea();
  txtrHereAreSome.setEditable(false);
  txtrHereAreSome.setBackground(SystemColor.controlHighlight);
  txtrHereAreSome.setWrapStyleWord(true);
  txtrHereAreSome.setFont(new Font("Tahoma", Font.PLAIN, 11));
  txtrHereAreSome.setText("Here are some things to do, to lose weight:\r\n  ~Inclue excercise in your daily routine\r\n  ~Do aerobic excercises (running, swimming, kickboxing...)\r\n  ~Avoid uncessary eating and eat more veggies\r\n  ~Lower sugar and salt intake");
  
  JTextArea txtrToMaintainYour = new JTextArea();
  txtrToMaintainYour.setEditable(false);
  txtrToMaintainYour.setFont(new Font("Tahoma", Font.PLAIN, 11));
  txtrToMaintainYour.setBackground(SystemColor.controlHighlight);
  txtrToMaintainYour.setText("To maintain your weight,  do these:\r\n  ~Exercise often\r\n  ~Increase veggie and protein intake\r\n  ~Eat Breakfast everyday and stay hydrated\r\n  ~Start weight lifting and yoga");
  
  JLabel lblGoTo = new JLabel("Click on Track to choose your option");
  lblGoTo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
  GroupLayout gl_contentPane = new GroupLayout(contentPane);
  gl_contentPane.setHorizontalGroup(
   gl_contentPane.createParallelGroup(Alignment.LEADING)
    .addGroup(gl_contentPane.createSequentialGroup()
     .addGap(5)
     .addComponent(lblGain, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
     .addGap(47)
     .addComponent(txtrIfYouWant, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
     .addGap(44))
    .addGroup(gl_contentPane.createSequentialGroup()
     .addGap(5)
     .addComponent(lblLose, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
     .addGap(47)
     .addComponent(txtrHereAreSome, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
     .addGap(44))
    .addGroup(gl_contentPane.createSequentialGroup()
     .addGap(5)
     .addComponent(lblMaintain, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
     .addGap(4)
     .addComponent(txtrToMaintainYour, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
     .addGap(44))
    .addGroup(gl_contentPane.createSequentialGroup()
     .addGap(126)
     .addComponent(lblGoTo, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
  );
  gl_contentPane.setVerticalGroup(
   gl_contentPane.createParallelGroup(Alignment.LEADING)
    .addGroup(gl_contentPane.createSequentialGroup()
     .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      .addGroup(gl_contentPane.createSequentialGroup()
       .addGap(6)
       .addComponent(lblGain, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
      .addComponent(txtrIfYouWant, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
     .addGap(6)
     .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      .addGroup(gl_contentPane.createSequentialGroup()
       .addGap(5)
       .addComponent(lblLose, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
      .addComponent(txtrHereAreSome, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
     .addGap(6)
     .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      .addGroup(gl_contentPane.createSequentialGroup()
       .addGap(1)
       .addComponent(lblMaintain, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
      .addComponent(txtrToMaintainYour, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
     .addGap(11)
     .addComponent(lblGoTo))
  );
  contentPane.setLayout(gl_contentPane);
 }
 public JLabel getLblIfYouWant() {
  return getLblIfYouWant();
 }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
}
