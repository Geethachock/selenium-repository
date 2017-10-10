package TestNGfiles;
/* child class extends parent class and calls it's methods*/
public class childClass extends baseclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   childClass obj1 = new childClass();
       obj1.add(8, 2);
       obj1.sub(4, 2);
       obj1.mult(2, 3);
       obj1.div(3, 3);
	}
	public void mult(int a, int b)
	{
		int c = a * b;
		System.out.println("print"+c);
	}
    
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("print"+c);
	}


}
