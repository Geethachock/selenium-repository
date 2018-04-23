
public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "";
		String str = "The fox is Brown";
		System.out.println(str.length());
		for(int i=str.length()-1; i>=0 ;i--)
		{   
			 num = num + str.charAt(i);
		}
		
      System.out.println(num);
	}

}
