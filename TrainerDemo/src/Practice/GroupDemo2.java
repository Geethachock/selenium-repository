package Practice;

import org.testng.annotations.Test;

public class GroupDemo2 {
	@Test(groups={"smokeTest"})
	public void Testcase3()
	{
		System.out.println("Login successfully");
	}
	@Test(groups={"FunctionalTest"})
	public void Testcase4()
	{
		System.out.println("Login successfully");
	}
}
