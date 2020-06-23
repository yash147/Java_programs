class Array
{
int s;
int a[];
Array()
{
System.out.println("Enter the size of array");
java.util.Scanner sc=new java.util.Scanner(System.in);
s=sc.nextInt();
a=new int[s]; 
System.out.println("Enter "+s+" elements of array");
for(int i=0;i<s;i++)
{
	a[i]=sc.nextInt();
}
}
	int big(int arr[]) 
	{
	int big=arr[0];
	for(int i=0;i<s;i++)
	{
		if(big<arr[i])
		{
		big=a[i];
		}
	}
	return big;
	}
	 
	int small(int arr[])
	{
		int small=arr[0];
		for(int i=0;i<s;i++)
		{
			if(small>arr[i])
			{
			small=a[i];
			}
		}
	return small;
	}
	
	void prime(int arr[])
	{  
		int i=0;
		while(i!=s)
		{
			if(a[i]%2!=0&&a[i]%3!=0&&a[i]%5!=0&&a[i]%7!=0)
			{
				System.out.println(a[i]+" is a prime number");
			}
			else
			 {
				System.out.println(a[i]+" is not a prime number");
			}
			i++;
		}
	}
	
	void sbig(int arr[])
	{
		int big=arr[0];
		int sbig=arr[0];
		for(int i=0;i<s;i++)
		{
			
			
			if(big==arr[0])
			{
			System.out.println("big"+big);
			}
			else
		    if(big<arr[i])
			{
			sbig=big;
			big=a[i];
			}
		System.out.println("Second big = "+sbig);
	}
public static void main(String lk[])
{
int x;
Array o = new Array();
//x=o.big(o.a);
//x=o.small(o.a);
//System.out.println("Biggest element is " +x);
//System.out.println("Smallest element is " +x);
//o.prime(o.a);
o.sbig(o.a);

}
}
