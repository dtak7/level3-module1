package _06_Intro_To_Hash_Maps;

import java.util.HashMap;

public class Chesckpint {
public static void main(String[] args) {
HashMap<String,String> words = new HashMap<String,String>();	
words.put("me", "bogol");
words.put("you ","palgu");
words.put("bathroom", "unlodeer");
words.put("one", "pat");
words.put("two", "nat");
words.put("three", "shoom");
words.put("four", "shroom");
words.put("five", "wer");
for(String key: words.keySet()) {
	String value=words.get(key);
	System.out.println(value);
}

}
}
