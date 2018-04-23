package Practice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skipmethod {
	@Test
	public void skipmethod()
	{
		String Condition = "skip test";
				if(Condition.equals("skip test"))
				{
				throw new SkipException("It will completely skip and go the next method");	
				}
				else{
					System.out.println("It will skip this too");
				}
	}

	@Test
	public void nexttest()
	{
		System.out.println("It will skip and excecute the next method");
	}
}
