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

public class Informational extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Informational frame = new Informational();
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
	public Informational() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnTrackGain = new JMenu("Track");
		menuBar.add(mnTrackGain);
		
		JMenuItem mntmTrackGain = new JMenuItem("Track Gain");
		mntmTrackGain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code for gain
			}
		});
		mnTrackGain.add(mntmTrackGain);
		
		JMenuItem mntmTrackLoss = new JMenuItem("Track Loss");
		mntmTrackLoss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code for loss
			}
		});
		mnTrackGain.add(mntmTrackLoss);
		
		JMenuItem mntmTrackMaintain = new JMenuItem("Track Maintain");
		mntmTrackMaintain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code for maintain
			}
		});
		mnTrackGain.add(mntmTrackMaintain);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGain = new JLabel("Gain");
		lblGain.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGain.setBounds(27, 37, 46, 19);
		contentPane.add(lblGain);
		
		JLabel lblLose = new JLabel("Lose");
		lblLose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLose.setBounds(27, 114, 46, 23);
		contentPane.add(lblLose);
		
		JLabel lblMaintain = new JLabel("Maintain");
		lblMaintain.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaintain.setBounds(27, 183, 89, 19);
		contentPane.add(lblMaintain);
	}
}
