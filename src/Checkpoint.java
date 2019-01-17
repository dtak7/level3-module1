import javax.swing.JOptionPane;

public class Checkpoint {
public static void main(String[] args) {
 int[] numbers = new int[5];
 for(int i = 0; i<numbers.length;i++) {
String answer = JOptionPane.showInputDialog("Enter a number");
 int result = Integer.parseInt(answer);
numbers[i]=result;
}
 int total=0;
for( int i = 0; i< numbers.length;i++) {
total=total+numbers[i];
System.out.println(total);
 }
}
}