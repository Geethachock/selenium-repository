import java.util.Scanner;

public class Swaptwovariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number a");
		int a = s.nextInt();
		System.out.println("Enter number b");
		int b = s.nextInt();
		temp = a;
		a=b;
		b=temp;
		System.out.println("print the value of a is"+a);
		System.out.println("print the value of b is"+b);
			

	}

}
