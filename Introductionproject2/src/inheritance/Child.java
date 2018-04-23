package inheritance;

public class Child extends Parent{
	String str="tamilnadu";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		c.city();
		c.state();

	}
	public void state()
	{  
		System.out.println(str);
		
	}
	public void city()
	{  //super keyword is used when there is a duplicate method or variable and you want to print the super class variable 
		//or method you use super.parent class variable or method
		super.city();
		System.out.println("i am the child mehod");
	}

}
