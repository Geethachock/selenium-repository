package Practice;

import org.testng.annotations.Test;

public class GroupDemo1 {
	@Test(groups={"smokeTest","FunctionalTest"})
	public void Testcase1()
	{
		System.out.println("Login successfully");
	}
	@Test(groups={"FunctionalTest"})
	public void Testcase2()
	{
		System.out.println("Login successfully");
	}

}
