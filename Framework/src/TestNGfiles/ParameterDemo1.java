package TestNGfiles;

public class ParameterDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passingParameterDemo obj1 = new passingParameterDemo();
		ParameterDemo1 obj2 = new ParameterDemo1();
		int c = obj1.add(6, 6);
		System.out.println("print"+c);
		obj2.sub(10,4);

	}
	
	public void sub(int a, int b)
	{
		int c = a - b;
		System.out.println("print"+c);
	}

}
