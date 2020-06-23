class FactRecur
{
FactRecur()
{
System.out.println("Enter  a number to find the factorial");
java.util.Scanner sc = new java.util.Scanner(System.in);
int j=sc.nextInt();
}
	static void facto(int j)
	{
		while(j>=1)
		{
		int fact=1;
		fact=fact*j;
		j--;
		facto();
		System.out.println("Factorial is "+fact);
		}	
	}
public static void main(String y[])
{
 FactRecur f = new FactRecur();
 FactRecur.facto(j);
}
}
