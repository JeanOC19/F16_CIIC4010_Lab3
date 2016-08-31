import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame("Jean Candelaria");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(800, 470);
		myFrame.setSize(230, 200);
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}