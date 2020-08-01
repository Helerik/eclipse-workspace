import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI5 extends JFrame{
	
	private JList leftlist;
	private JList rightlist;
	private JButton movebutton;
	private static String[] foods = {"bacon", "wings", "ham", "beef", "tuna"};
	
	public GUI5() {
		super("title");
		setLayout(new FlowLayout());
		
		leftlist = new JList (foods);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		movebutton = new JButton("move -->");
		movebutton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					rightlist.setListData(leftlist.getSelectedValuesList().toArray());
				}
			}
		);
		add(movebutton);
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellHeight(15);
		rightlist.setFixedCellWidth(100);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
	}
	

}
