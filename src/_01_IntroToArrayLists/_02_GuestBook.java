package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	ArrayList<String> names = new ArrayList<String>();
	String n;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addButton = new JButton("Add Name");
	JButton viewButton = new JButton("View Name");
	public static void main(String[] args) {
		_02_GuestBook book = new _02_GuestBook();
		book.GUICreator();
		
	}
	
	 void GUICreator() {
		 
		// Create a GUI with two buttons. One button reads "Add Name" and the other
				// button reads "View Names".
				
				frame.add(panel);
				panel.add(addButton);
				panel.add(viewButton);
				frame.setVisible(true);
				frame.setSize(300, 200);	
				// When the add name button is clicked, display an input dialog that asks the
				// user to enter a name. Add
				addButton.addActionListener(this);
				// that name to an ArrayList. When the "View Names" button is clicked, display a
				// message dialog that displays
				// all the names added to the list. Format the list as follows:
				viewButton.addActionListener(this);
				// Guest #1: Bob Banders
				// Guest #2: Sandy Summers
				// Guest #3: Greg Ganders
				// Guest #4: Donny Doners
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==addButton) {
		String n =JOptionPane.showInputDialog("Add a name please");
		names.add(n);
		}
		else {
			JOptionPane.showMessageDialog(null, names);
		}
	}
}

