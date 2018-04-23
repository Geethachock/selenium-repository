package simplejava;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("hello world");
		String t="";
		for(int i=str.length()-1;i>=0;i--)
		{   
			t =t +str.charAt(i);
			
		}
		System.out.println(t);

	}

}
