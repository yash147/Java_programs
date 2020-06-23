class Poww
{
public static void main(String f[])
{
	for(int j=50;j<=100;j++)
	{
		int b=j;
		int d=0;
		int e=0;
		while(b!=0)
		{
		b=b/10;
		e++;
		d=e;
	int temp=0;
		int str=0;
		while(b!=0)
		{
		temp=b%10;
		b=b/10;
		int result=1;
		
		for(int i=1;i<=d;i++)
		{
			result=result*temp; 
		}
		str=str+result;
		d--;
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
}
}	
}