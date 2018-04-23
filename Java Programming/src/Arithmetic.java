
public class Arithmetic {
   int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o;
   int finaladd,finalsub,finalmul,finaldiv,finalmod;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic num = new Arithmetic();
		int finaladd = num.add(8, 9);
		int finalsub = num.sub(8, 9);
		int finalmul = num.mul(8, 9);
		int finaldiv = num.div(8, 9);
		int finalmod = num.mod(8, 9);
		
		System.out.println("The value is"+ finaladd);
		System.out.println("The value is"+ finalsub);
		System.out.println("The value is"+ finalmul);
		System.out.println("The value is"+ finaldiv);
		System.out.println("The value is"+ finalmod);

	}
  public int add(int a, int b)
  {
	 c = a+b;
	 return c;
  }
  public int sub(int d, int e)
  {
	 f = d-e;
	 return f;
  }
  public int mul(int g, int h)
  {
	 i = g*h;
	 return i;
  }
  public int div(int j, int k)
  {
	 l = j/k;
	 return l;
  }
  public int mod(int m, int n)
  {
	 o = m%n;
	 return o;
  }
}
