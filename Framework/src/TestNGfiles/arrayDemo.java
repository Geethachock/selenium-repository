package TestNGfiles;
/* declaring a array and printing it's values */
public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentid[] = new int[5];
		studentid[0]=40;
		studentid[1]=41;
		studentid[2]=42;
		studentid[3]=43;
		studentid[4]=44;
		for(int i=0;i<studentid.length;i++)
		{
			System.out.println("the id is"+studentid[i]);
		}
		

	}

}
