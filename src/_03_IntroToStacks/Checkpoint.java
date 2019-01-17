package _03_IntroToStacks;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Checkpoint {
public static void main(String[] args) {
	Stack<Integer> numbers = new Stack<Integer>();
	int total = 0;

	for(int i = 0; i<3; i++) {
		int random = (int )(Math. random() * 50 + 1); 
		System.out.println("the random numbers are " +random);
		numbers.push(random);
	}
	for(int i = 0; i <3;i++) {
		total+=numbers.pop();
	}
	JOptionPane.showMessageDialog(null, total);
}
}
