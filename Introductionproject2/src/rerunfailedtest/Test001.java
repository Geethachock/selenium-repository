package rerunfailedtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
@Test
//error prone couldn't fix it
public void Test1(retryAnalyzer = RetryAnalyzer.class)
{
	Assert.assertEquals("True",false);
}
@Test
public void Test2()
{
	Assert.assertEquals("True",false);
}
}
