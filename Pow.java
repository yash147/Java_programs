class Pow
{
		int b;
		int e;
	 Pow()
	 {
		System.out.println("Enter the number");
		java.util.Scanner sc =new java.util.Scanner(System.in);
		b= sc.nextInt();	
	}
	void digit(int c)
	{
		 e=0;
		while(c!=0)
		{
		c=c/10;
		e++;
		}
	
	}
	void sum(int c)
	{
		int temp=0;
		int str=0;
		while(c!=0)
		{
		temp=c%10;
		c=c/10;
		int result=1;
		
		for(int i=1;i<=e;i++)
		{
			result=result*temp; 
		}
		str=str+result;
		e--;
		}
		System.out.println(str);
		if(b==str)
		{
		System.out.println("Number is diaeresis");
		}
		else
		{
		System.out.println("Number is not Diaeresis");
		}
		
	}
	
public static void main(String h[])
{
Pow p =new Pow();
p.digit(p.b);
p.sum(p.b);
}
}