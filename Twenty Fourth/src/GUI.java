import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
	
	private String details;
	private JLabel statusbar;
	
	public GUI() {
		super("title");
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new MouseClass());
		
	}
	
	private class MouseClass extends MouseAdapter{
		public void mouseClicked(MouseEvent event) {
			details = String.format("You clicked %d ", event.getClickCount());
			
			if (SwingUtilities.isRightMouseButton(event)) {
				details += "with right mouse button";
			}
			else if (SwingUtilities.isMiddleMouseButton(event)) {
				details += "with center mouse button";
			}
			else {
				details += "with left mouse button";
			}
			
			statusbar.setText(details);
		}
	}
}
