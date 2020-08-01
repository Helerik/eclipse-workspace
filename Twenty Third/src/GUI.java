import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI extends JFrame{
	
	private JButton reg;
	private JButton custom;
	
	public GUI() {
		super("Title"); // add title to window
		setLayout(new FlowLayout());
		
		reg = new JButton("button txt");
		add(reg);
		
		Icon b = new ImageIcon(getClass().getResource("button.png"));
		Icon x = new ImageIcon(getClass().getResource("button.png"));
		
		custom = new JButton("custom", b); // receives a name and an image
		custom.setRolloverIcon(x); // changes image when hovering over the button
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	}
	
	private class HandlerClass implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
		
		
	}

}
