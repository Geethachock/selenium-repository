package package1formodifiers;

public class Accessmodifiers extends Publicmodifiersinsubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmodifiers am = new Accessmodifiers();
		am.city();
		
		am.country();
		am.city1();

	}
	/* If a modifier is public it can be accessed by it's class,by subclas,by it's package and from other
	 packages. city() can be accessible everywhere*/
	public void city()
	{
		System.out.println("print city tamilnadu");
	}
	
    void city1()
    {
    	System.out.println("print city tamilnadu1");
    }

}
