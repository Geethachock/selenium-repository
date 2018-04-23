package simplejava;

public class Constructorjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Constructorjava ch = new Constructorjava();
    Constructorjava che = new Constructorjava(4,5);
    
	}
	public Constructorjava(){
		//I am Constructor,I don't have return type,I use the class name,I get invoked whenever an object gets created.
		System.out.println("print me");
	}
	//parameterized constructor
	//it will also excecute when u define a objectand pass parameters
	public Constructorjava(int a, int b){
		//I am Constructor,I don't have return type,I use the class name,I get invoked whenever an object gets created.
		System.out.println("print me with numbers");
	}

}
