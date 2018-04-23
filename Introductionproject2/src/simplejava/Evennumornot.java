package simplejava;

import java.util.Scanner;

public class Evennumornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("enter a number:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		if (number%2==0)
		{
			System.out.println("It is a even number");
		}
		else
		{
			System.out.println("It is not a even number");
		}

	}

}
