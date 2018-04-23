import java.util.Scanner;

public class MultiplicationOfNumbeUptoTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(number*i);
		}
	}

}
