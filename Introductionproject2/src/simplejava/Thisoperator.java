package simplejava;

public class Thisoperator {
  int a=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thisoperator op = new Thisoperator();
		op.localmethod();
		

	}
	public void localmethod()
	{
		int a=3;
		System.out.println(a);
		//this operator is used for accessing the objects in class level
		System.out.println(this.a);
	}

}
