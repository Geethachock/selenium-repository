import java.util.Scanner;

public class ComparingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   Scanner s = new Scanner(System.in);
	System.out.println("Enter number1");
	int number1 = s.nextInt();
	System.out.println("Enter number2");
	int number2 = s.nextInt();
	if(number1==number2)
	{
		System.out.println(number1+"="+number2 );
	}
	else if(number1!=number2)
	{
		System.out.println(number1 +"!="+ number2);
	
	 if(number1>number2)
	{
		System.out.println(number1+">"+number2);
	}
	else if(number1<number2)
	{
		System.out.println(number1+"<"+number2);
	}

	}
	
	}

}
