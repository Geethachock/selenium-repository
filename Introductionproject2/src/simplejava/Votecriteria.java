package simplejava;

import java.util.Scanner;

public class Votecriteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your age:");
		 Scanner s = new Scanner(System.in);
		 int age= s.nextInt();
		if(age>=18)
		{
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you cannot vote");
		}
		System.out.println("Thanks for voting");
        
	}

}
