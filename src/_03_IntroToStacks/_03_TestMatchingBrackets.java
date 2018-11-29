package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.jupiter.api.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<String> brackets = new Stack<String>();
		
		for (int i = 0; i < b.length(); i++) {
			char c=b.charAt(i);
			if (c=='{') {
				brackets.push(b);
				System.out.println("push");

			}
			else if (c=='}') {
				if(brackets.empty()) {
					return false;
				}
				brackets.pop();
				System.out.println("pop");
			}
		}
		if (!brackets.empty()) {
			
			return false;
			
		} else {
			return true;

		}
	}
}