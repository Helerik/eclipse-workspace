import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI3 extends JFrame{
	private JComboBox box;
	private JLabel picture;
	private static String[] filename = {"button.png", "button1.png"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),
			new ImageIcon(getClass().getResource(filename[1]))};
	
	public GUI3() {
		super("title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename);
		
		box.addItemListener(
			new ItemListener() {
				public void itemStateChanged(ItemEvent event) {
					if (event.getStateChange() == ItemEvent.SELECTED) {
						picture.setIcon(pics[box.getSelectedIndex()]);
					}
				}
			}
		);
		
		add(box);
		picture = new JLabel(pics[0]);
		add(picture);
		
	}
	
	
}
