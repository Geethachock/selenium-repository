import java.util.Scanner;

public class StringtoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input an number(string)");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int result  = Integer.parseInt(str);
		System.out.println(result);

	}

}
