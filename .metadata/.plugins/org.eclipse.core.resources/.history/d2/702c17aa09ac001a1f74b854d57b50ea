import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout extends JFrame{
	
	private JButton lbutton;
	private JButton cbutton;
	private JButton rbutton;
	private FlowLayout layout;
	private Container container;
	
	public Layout() {
		super("title");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		lbutton = new JButton("left");
		add(lbutton);
		lbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
		);
		cbutton = new JButton("center");
		add(cbutton);
		cbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
		);
		rbutton = new JButton("right");
		add(rbutton);
		rbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
		);
	}

}
