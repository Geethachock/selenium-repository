import java.util.Scanner;

public class SumOfAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			System.out.println("Enter number1");
			int num = s.nextInt();
			int sum = 0;
			while(num>0)
			{
				sum +=num%10;
				num /=10;
			}
			System.out.println(sum);
	}

}
