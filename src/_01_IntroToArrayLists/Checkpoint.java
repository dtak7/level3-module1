package _01_IntroToArrayLists;

import java.util.ArrayList;

public class Checkpoint {
public static void main(String[] args) {
	ArrayList<Cow> cows =new ArrayList<Cow>();
	int random = (int )(Math. random() * 50 + 1);
	 for(int i=0; i<random;i++) {
		Cow cow = new Cow();
		cows.add(cow);
		cow.feed();
	 }
	 
}

}
class Cow {
     void feed(){
    	System.out.println("cow has eaten and is content");
    }
  }


