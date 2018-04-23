
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String sr="combo";
		char ch ='m';
		StringBuilder sb = new StringBuilder("combo");
		for(int i=0; i<sb.length();i++)
		{
			if(sb.charAt(i)==ch)
			{
			  sb.deleteCharAt(i);
			}
						
		}
		System.out.println(sb);
		

	}

}
