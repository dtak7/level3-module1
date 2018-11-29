package _04_HangMan;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class HangMan implements KeyListener{
	  Stack<String> words = new Stack<String>();
	  String currentWord;
	  String displayedWord="    ";
	  String newWord="";
	  JFrame frame = new JFrame();
		JLabel  label = new JLabel();
	public static void main(String[] args) {
		HangMan manhang = new HangMan();
		
		manhang.createStack(); 
		manhang.setWord();
		manhang.createFrame();
		
		}
	void createStack() {
		String answer =JOptionPane.showInputDialog("choose a number from 1 to 266");
		int answerNumber = Integer.parseInt(answer);		
		for(int i = 0; i<answerNumber;i++) {
			words.push(Utilities.readRandomLineFromFile("src/_04_HangMan/dictionary.txt"));
	}
	}
		
	void setWord() {
		currentWord =words.pop();
		
		for(int i=0;i<currentWord.length();i++) {
			displayedWord+="_";
		}
	}
	void createFrame() {
	label.setText(newWord);
	
	frame.add(label);
	frame.setVisible(true);
	frame.setSize(300, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char c= e.getKeyChar();
		
		for(int i = 0; i<currentWord.length();i++) {	
			char d = currentWord.charAt(i);
			
			if(e.getKeyChar()==c) {
			newWord+=d;
			}
			else {
				newWord+=displayedWord.charAt(i);
			}
		}
		displayedWord=newWord;
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
