class Mmul
{
int s;
int a[][];
int b[][];
	Mmul()
	{
	System.out.println("Enter the size of array");
	
	java.util.Scanner sc=new java.util.Scanner(System.in);
	s=sc.nextInt();
	a=new int[s][s];
	b=new int[s][s]; 
	System.out.println("Enter "+s+"*"+s+" elements of 1st matrics");
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				System.out.print("a["+i+"]["+j+"]"+"=");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter "+s+"*"+s+" elements of 2nd matrics");
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				System.out.print("b["+i+"]["+j+"]"+"=");
				b[i][j]=sc.nextInt();
			}
		}
	}
	
	void mul(int a[][],int b[][])
	{
			
		int t;
		int c[][];
		c=new int[s][s];
		for(int k=0;k<s;k++)
		{
			for(int i=0;i<s;i++)
			{  
				t=0;
				for(int j=0;j<s;j++)
				{
					t=t+(a[k][j]*b[j][i]);
				}
				c[k][i]=t;
			}	
		}
    System.out.println("Multiplication is =");
	for(int i=0;i<s;i++)
	{
		for(int j=0;j<s;j++)
		{
				System.out.println("c["+i+"]"+"["+j+"]"+"="+c[i][j]);
		}
	}
	}
public static void main(String lk[])
	{
	Mmul o = new Mmul();
	o.mul(o.a,o.b);
	}
}
