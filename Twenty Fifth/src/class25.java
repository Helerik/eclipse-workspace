import java.awt.Color;
import java.util.*;
import javax.swing.*;

public class class25 {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first num: ");
		int n1 = input.nextInt();
		System.out.println("Enter second num: ");
		int n2 = input.nextInt();
		
		try {
			System.out.println(n1/n2);
		}
		catch(Exception some_error) {
			System.out.println("An error occurred.");
			System.out.println(some_error);
		}*/
	
	Layout lay = new Layout();
	lay.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	lay.setSize(300,100);
	//lay.setResizable(false);
	lay.setVisible(true);
	
	JFrame f = new JFrame("Title");
	f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	graphic_plot plt = new graphic_plot();
	f.add(plt);
	f.setSize(400,250);
	f.setVisible(true);
	
	colorChooser cc = new colorChooser();
	cc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	drawer d = new drawer();
	d.setBackground(Color.WHITE);
	JFrame frame = new JFrame("Some title");
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.add(d);
	frame.setSize(500, 270);
	frame.setVisible(true);
	
	// String Comparisson
	
	String a = "apples";
	String name = "Erik";
	String name2 = "ERIK";
	
	if (a.equals("apples")) {
		System.out.println("It equals apples");
	}
	
	if (name.equalsIgnoreCase(name2)) {
		System.out.println("Its equal");
	}
	
	
	
	
	
	
	}

}
