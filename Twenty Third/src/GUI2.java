import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI2 extends JFrame{
	
	private JTextField tf;
	private Font plain;
	private Font bold;
	private Font italic;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public GUI2() {
		super("title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Some text", 25);
		add(tf);
		
		pb = new JRadioButton("plain", true);
		bb = new JRadioButton("bold", false);
		ib = new JRadioButton("italic", false);
		bib = new JRadioButton("bold & italic", false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		plain = new Font("Serif", Font.PLAIN, 14);
		bold = new Font("Serif", Font.BOLD, 14);
		italic = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		tf.setFont(plain);
		
		// wait for event to happen, pass in font object to constructor
		pb.addItemListener(new HandlerClass(plain));
		bb.addItemListener(new HandlerClass(bold));
		ib.addItemListener(new HandlerClass(italic));
		bib.addItemListener(new HandlerClass(bif));
		
	}
	
	
	private class HandlerClass implements ItemListener{
		private Font font;
		
		public HandlerClass(Font f) {
			font = f;
		}
		
		public void itemStateChanged(ItemEvent event) {
			tf.setFont(font);
		}
	}

}
