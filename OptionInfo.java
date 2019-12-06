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

public class OptionInfo extends JFrame {

	private JPanel contentPane;

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
				GainTracker gain = new GainTracker();
				gain.setVisible(true);
			}
		});
		mnTrackGain.add(mntmTrackGain);
		
		JMenuItem mntmTrackLose = new JMenuItem("Track Lose");
		mntmTrackLose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoseTracker lose = new LoseTracker();
				lose.setVisible(true);
			}
		});
		mnTrackGain.add(mntmTrackLose);
		
		JMenuItem mntmTrackMaintain = new JMenuItem("Track Maintain");
		mntmTrackMaintain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MaintainTracker maintain = new MaintainTracker();
				maintain.setVisible(true);
			}
		});
		mnTrackGain.add(mntmTrackMaintain);
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
		txtrIfYouWant.setBackground(SystemColor.controlHighlight);
		txtrIfYouWant.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrIfYouWant.setWrapStyleWord(true);
		txtrIfYouWant.setText("If you want to gain weight, here are a few things to do:\r\n  ~Dont't skip a meal (have 4-5 meals/day)\r\n  ~Increase protein-rich foods and carb intake\r\n  ~Eat dense fruit and veggies (bannan, apple, carror, corn...)\r\n  ~Begin weight training");
		
		JTextArea txtrHereAreSome = new JTextArea();
		txtrHereAreSome.setBackground(SystemColor.controlHighlight);
		txtrHereAreSome.setWrapStyleWord(true);
		txtrHereAreSome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrHereAreSome.setText("Here are some things to do, to lose weight:\r\n  ~Inclue excercise in your daily routine\r\n  ~Do aerobic excercises (running, swimming, kickboxing...)\r\n  ~Avoid uncessary eating and eat more veggies\r\n  ~Lower sugar and salt intake");
		
		JTextArea txtrToMaintainYour = new JTextArea();
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
}