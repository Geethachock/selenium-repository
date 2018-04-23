package simplejava;

public class StaticvariablesandNonstatic {
   static int wheels=30;
   int rubber=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wheels);
		//cannot print this because static method can have only static variables and methods
		//create a object for class and then access the non static variable and print it.
		//System.out.println(rubber);
		StaticvariablesandNonstatic sn = new StaticvariablesandNonstatic();
		System.out.println(sn.rubber);
		//cannot access a non static method without it's object;
		//add();
		sn.add();
		subtract();
		

	}
	public void add()
	{
		System.out.println("do i have to really add?");
	}
	public static void subtract()
	{
		System.out.println("do i have to really sub?");
	}


}
