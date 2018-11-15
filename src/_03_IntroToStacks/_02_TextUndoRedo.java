package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	// * Create a JFrame with a JPanel and a JLabel.
	JFrame frame = new JFrame("Test Undo Redo");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> chars = new Stack<Character>();
	public static void main(String[] args) {

		_02_TextUndoRedo txt = new _02_TextUndoRedo();
		txt.setup();
	}

	void setup() {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.setSize(400, 400);
		label.setVisible(true);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		// * Every time a key is pressed, add that character to the JLabel. It should
		// look like a basic text editor.

		// is erased from the JLabel
		// * Make it so that every time the BACKSPACE key is pressed, the last character
		// * Save that deleted character onto a Stack of Characters.
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			char c = label.getText().charAt(label.getText().length() - 1);
			chars.push(c);
			String r = label.getText().substring(0, label.getText().length() - 1);
			label.setText(r);
		} else if (e.getKeyCode() == KeyEvent.VK_ALT) {
			char undo = chars.pop();
			String finalText = label.getText() + undo;
			label.setText(finalText);

		} else {
			String finalText = label.getText() + e.getKeyChar();
			label.setText(finalText);

		}

		// * Choose a key to be the Undo key. Make it so that when that key is pressed,
		// the top Character is popped off the Stack and added back to the JLabel.

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}