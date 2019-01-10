package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {

	// Crate a HashMap of Integers for the keys and Strings for the values.
	HashMap<Integer, String> hash = new <Integer, String>HashMap();
	JButton entry; 
	JButton search;
	JButton view;
	JButton remove;
	public static void main(String[] args) {
		_02_LogSearch logSearch = new _02_LogSearch();
		logSearch.createGUI();
	}

	// / * Create a GUI with three buttons.
	void createGUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		 entry = new JButton();
		 search = new JButton();
		 view = new JButton();
		 remove = new JButton();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		panel.add(entry);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		entry.setText("entry");
		entry.addActionListener(this);
		search.setText("search");
		search.addActionListener(this);
		view.setText("view");
		view.addActionListener(this);
		remove.setText("remove entry");
		remove.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// * Button 1: Add Entry
	// * When this button is clicked, use an input dialog to ask the user to enter
	// an ID number.
	// * After an ID is entered, use another input dialog to ask the user to enter a
	// name.
	// * Add this information as a new entry to your HashMap.
	// *
	// * Button 2: Search by ID
	// * When this button is clicked, use an input dialog to ask the user to enter
	// an ID number.
	// * If that ID exists, display that name to the user.
	// * Otherwise, tell the user that that entry does not exist.
	// *
	// * Button 3: View List
	// * When this button is clicked, display the entire list in a message dialog in
	// the following format:
	// * ID: 123 Name: Harry Howard
	/// * ID: 245 Name: Polly Powers
	// * ID: 433 Name: Oliver Ortega
	// * etc...
	// *
	// * When this is complete, add a fourth button to your window.
	// * Button 4: Remove Entry
	// * When this button is clicked, prompt the user to enter an ID using an input
	// dialog.
	// * If this ID exists in the HashMap, remove it. Otherwise, notify the user
	// that the ID
	// * is not in the list.
	// *
	// * */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==entry) {
		String ID = JOptionPane.showInputDialog(null, "enter an ID NUMBER");
		int result = Integer.parseInt(ID);
		String name = JOptionPane.showInputDialog(null, "enter a name");
		hash.put(result, name);
		}
		else if(e.getSource()==search) {
			String search =JOptionPane.showInputDialog("enter an ID number to search for a name");
			int result = Integer.parseInt(search);
			JOptionPane.showMessageDialog(view, "the name associated with your ID number is "+hash.get(result));
		}
		else if(e.getSource()==view) {
			JOptionPane.showMessageDialog(view, hash);
		}
		else if(e.getSource()==remove) {
			String removing =JOptionPane.showInputDialog("enter an ID that you would like to remove");
			int result= Integer.parseInt(removing);
			if(hash.containsKey(result)) {
				hash.remove(result);
			}
			else {
				JOptionPane.showMessageDialog(null, "the ID you are looking for doesn't exist");
			}
			
		}
	}

}
