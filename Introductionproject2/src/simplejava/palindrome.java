package simplejava;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="madam";
		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2 = str2+str1.charAt(i);
			
		}
		System.out.println(str2);
		System.out.println(str1);
		
		if(str1==str2)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		

	}

}
