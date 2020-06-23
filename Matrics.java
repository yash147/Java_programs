class Matrics
{
 int a[][];
 int b[][];
 int s;
Matrics()
{
System.out.println("Enter the size of array");
java.util.Scanner sc=new java.util.Scanner(System.in);
s=sc.nextInt();
a=new int[s][s];
b=new int [s][s]; 
System.out.println("Enter "+s*s+" elements for fist metrics");
	for(int i=0;i<s;i++)
	{
		for(int j=0;j<s;j++)
		{		
				System.out.print("value of a["+i+"]["+j+"]= ");
				a[i][j]=sc.nextInt();
		}
	}
System.out.println("Enter "+s*s+" elements for Secomd metrics");
	for(int i=0;i<s;i++)
	{
		for(int j=0;j<s;j++)
		{			
				System.out.print("value of b["+i+"]["+j+"]= ");
				b[i][j]=sc.nextInt();
		}
	}
}

	void mul(int a[][],int b[][])
	{	
		int temp;
		int c[][];
		c=new int[s][s];
		for(int x=0;x<s;x++)
		{
			for(int i=0;i<s;i++)
			{  
				temp=0;
				for(int j=0;j<s;j++)
				{
					temp=temp+(a[x][j]*b[j][i]);
				}
				c[x][i]=temp;
			}
		}
	for(int i=0;i<s;i++)
			{
				for(int j=0;j<s;j++)
				{
					System.out.println("-----------------------------");
					System.out.println("Matrics  is= "+c[i][j]);	
				}
			}
	
	
	
	}
	
public static void main(String gg[])
{
Matrics m=new Matrics();
m.mul(m.a,m.b);
}
}