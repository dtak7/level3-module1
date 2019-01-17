package _01_IntroToArrayLists;

import java.util.ArrayList;

public class checkpoint {
public static void main(String[] args) {
	ArrayList<Cow> cows = new ArrayList<Cow>();
	 int random = (int )(Math. random() * 50 + 1); 
for(int i = 0; i <random; i++) {
 	Cow cow = new Cow();
 	cows.add(cow);
}
for(int i = 0; i <cows.size();i++) {
	cows.get(i).feed();
}
}
}

class Cow {
    public void feed(){
    	System.out.println("cow is fed and content.");
    }
  }