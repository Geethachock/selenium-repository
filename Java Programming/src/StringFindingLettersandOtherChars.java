
public class StringFindingLettersandOtherChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char emp;
		int charcount =0;
		String str = "The fox is Brown";
		System.out.println(str.length());
		
		for(int i=0; i<str.length();i++)
		{   
			emp =  str.charAt(i);
			if(Character.isLetter(emp))
				charcount++;
		}
		System.out.println(charcount);
     
	}

}