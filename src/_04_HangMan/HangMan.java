package _04_HangMan;

import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	Stack<String> words = new Stack<String>();
	String currentWord;
	String displayedWord = "";

	int life = 10;
	// Stack<Character> chars = new Stack<Character>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel lives = new JLabel();
	JLabel wrongAnswers = new JLabel();

	public static void main(String[] args) {
		HangMan manhang = new HangMan();

		manhang.createStack();
		manhang.setWord();
		manhang.createFrame();
		manhang.addListener();

	}

	void createStack() {
		words.clear();
		String answer = JOptionPane.showInputDialog("choose a number from 1 to 266");
		int answerNumber = Integer.parseInt(answer);
		for (int i = 0; i < answerNumber; i++) {
			words.push(Utilities.readRandomLineFromFile("src/_04_HangMan/dictionary.txt"));
		}
	}

	void setWord() {
		currentWord = words.pop();
		displayedWord = "";
		for (int i = 0; i < currentWord.length(); i++) {
			displayedWord += "_";
		}
	}

	void addListener() {
		frame.addKeyListener(this);
	}

	void createFrame() {
		frame.add(panel);
		panel.add(lives);
		panel.add(label);
		label.setText(displayedWord);
		lives.setText("      you have " + life + " lives");
		wrongAnswers.setText("you have incorrectly guessed: ");
		frame.setVisible(true);
		frame.setSize(300, 300);

		panel.setLayout((LayoutManager) new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(lives);
		panel.add(wrongAnswers);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		// TODO Auto-generated method stub

		// String finalText = label.getText() + e.getKeyChar();
		//

		char c = e.getKeyChar();
		boolean isCorrect = false;
		String newWord = "";
		for (int i = 0; i < currentWord.length(); i++) {

			char d = currentWord.charAt(i);

			if (c == d) {
				newWord += c;
				isCorrect = true;
			}

			else {
				newWord += displayedWord.charAt(i);
				// wrongAnswers.setText("you have incorrectly guessed:" + d );

			}

		}
		displayedWord = newWord;
		label.setText(displayedWord);
		if (currentWord.equals(displayedWord)) {
			JOptionPane.showMessageDialog(null, "YOU WIN. Congrats");
		}
		if (!isCorrect) {
			life -= 1;
			lives.setText("      you have " + life + " lives");

		}

		if (life == 0) {
			String playAgain = JOptionPane.showInputDialog(
					"Game Over. The correct answer was " + currentWord + " would you like to play again?");

			if (playAgain.equals("yes")) {
				System.out.println("working!");
				createStack();
				setWord();
				frame.remove(label);
				frame.dispose();
				createFrame();

				life = 10;
				lives.setText("      you have " + life + " lives");
			}

			else {
				JOptionPane.showMessageDialog(null, "Thanks for playing!");

				frame.dispose();
			}

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
