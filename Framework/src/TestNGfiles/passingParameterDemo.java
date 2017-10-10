package TestNGfiles;

public class passingParameterDemo {
	
	public static void main(String args[])
	{
		passingParameterDemo obj1 = new passingParameterDemo();
		int c = obj1.add(4, 3);
		System.out.println("print"+c);
	}
	
	public int add(int a,int b)
	{
		int c =a+b;
		return c;
	}

}
