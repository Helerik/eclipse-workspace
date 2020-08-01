
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class class18 {
	
	public static void main(String[] args) {
		tuna tunaObj = new tuna();
		
		tunaObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tunaObj.setSize(275,180);
		tunaObj.setVisible(true);
		
		
		String fn = JOptionPane.showInputDialog("Enter first number: ");
		String sn = JOptionPane.showInputDialog("Enter second number: ");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1+num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " + sum, "tile", JOptionPane.PLAIN_MESSAGE);
		
		
	}
}
