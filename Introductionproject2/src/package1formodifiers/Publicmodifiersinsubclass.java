package package1formodifiers;


public class Publicmodifiersinsubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publicmodifiersinsubclass pm =new Publicmodifiersinsubclass();
		Accessmodifiers am = new Accessmodifiers();
		//default access modifier accessible from the same package
		am.city1();
		pm.country();
		
	}
	public void country()
	{
		System.out.println("print the country");
	}

}
