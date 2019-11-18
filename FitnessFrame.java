import javax.swing.JFrame;

public class FitnessFrame {
	public static void main(String[] args){
		JFrame frame = new JFrame();
	    frame.setSize(425,550);
	    frame.setTitle("Fitness Tracker");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setContentPane(new FitnessTracker());
	    frame.setVisible(true);
	}
	
}
