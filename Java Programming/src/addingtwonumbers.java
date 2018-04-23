import java.util.Scanner;

public class addingtwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   Scanner s = new Scanner(System.in);
	System.out.println("Enter number1");
	int number1 = s.nextInt();
	System.out.println("Enter number2");
	int number2 = s.nextInt();
	System.out.println("Enter number3");
	int number3 = s.nextInt();
	if(number3==number1+number2)
	{
		System.out.println("The result is true");
	}
	else 
	{
		System.out.println("The result is false");
	}
	}

	
	
	}


