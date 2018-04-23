package simplejava;

public class Arrayaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[]={2,3,5,6};
		int sum =0;
		//int sum = c[0]+c[1]+c[2]+c[3];
		
		for(int i=0;i<c.length;i++)
		{
		 sum = sum + c[i];	
		}
		
		System.out.println(sum);

	}

}
