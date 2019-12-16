import javax.swing.JFrame;

/* This is the frame that starts whole project.
 It runs Fitness Tracker which leads to the rest of the program
*/
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
