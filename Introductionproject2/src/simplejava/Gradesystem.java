package simplejava;

import java.util.Scanner;

public class Gradesystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter your Score:");
     Scanner s = new Scanner(System.in);
	 int number = s.nextInt();
	 if(number>=90)
	 {
	 System.out.println("your Grade is A");
	 
	 }
	 else if(number>=70 && number<=90)
	 {
		 System.out.println("your Grade is B");
		
	 }
	 else if(number>=50 && number<=70)
	 {
		 System.out.println("your Grade is C");
		 
	 }
	 else
	 {
		 System.out.println("your Grade is D");
		 
	 }

}
}

