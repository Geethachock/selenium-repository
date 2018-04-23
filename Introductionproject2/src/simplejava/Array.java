package simplejava;

public class Array {
	public static void main(String args[])
	{
		int a[]={3,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Array ar = new Array();
		ar.twodimension();
		
	}
	public void twodimension()
	{
		
		int b[][] ={{3,4,5},{4,5,6},{4,7,8}};
		System.out.println("two dimensional array");
		int max=b[0][0];
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(b[i][j]>max)
				{
					max=b[i][j];
					
				}
			    
			}
		}
		System.out.println(max);
		

		}

}
