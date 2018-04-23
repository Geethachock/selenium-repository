package junitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Asserttest {
@Test
public void testsetup()
{
	String str ="I like to do testing";
	assertEquals("I like to do testing",str);
}
}
