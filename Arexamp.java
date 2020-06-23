class Arexamp
{
	
int s;
char a[];
	
	Arexamp()
	{
	System.out.println("Enter the size of array");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	s=sc.nextInt(); //input
	a=sc.next().charAt(char); //input
	System.out.println("Enter "+s+" elements of array");
	for(int i=0;i<s;i++)
	{
		a[i]=sc.next().charAt(i);
	}
	}
  /*  
	void sbig(int arr[])
	{		int temp;
			int big2=0;
		for(int i=0;i<s;i++)
		{
			
			for(int j=i+1;j<s;j++)
				{
					if(a[i]<a[j])
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
			if(i==1)
			{
			big2=a[i];
			}
		}
		System.out.println("Second biggest no. is= "+big2);
	}

void small(int arr[])
	{
			int temp;
			int small2=0;
		for(int i=0;i<s;i++)
		{
			
			for(int j=i+1;j<s;j++)
				{
					if(a[i]>a[j])
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
			if(i==1)
			{
			small2=a[i];
			}
		}
		System.out.println("Second smallest no. is "+small2);
	}

	void ascend(int arr[])
	{		int temp;
		for(int i=0;i<s;i++)
		{
			
			for(int j=i+1;j<s;j++)
				{
					if(a[i]>a[j])
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
			
		}
		System.out.println("Ascending order is ");
		for(int i=0;i<s;i++)
		{
		System.out.println(a[i]);
		}
		
	}
	
	void descend(int arr[])
	{		int temp;
		for(int i=0;i<s;i++)
		{
			
			for(int j=i+1;j<s;j++)
				{
					if(a[i]<a[j])
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
			
		}
		System.out.println("descending order is ");
		for(int i=0;i<s;i++)
		{
		System.out.println(a[i]);
		}
		
	}
	void repeat(int arr[])
	{		
			int count=0;
			int temp=0;
		for(int i=0;i<s;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(a[i]==a[j])
				{
				temp=a[i];
				count++;
				}
			}
		
		}
	System.out.println("Repeated elements is = "+temp);
		System.out.println("Number of repeataiton is = "+count);
	}
	*/
public static void main(String lk[])
{
	Arexamp o = new Arexamp();	
	//o.ascend(o.a);
	//o.sbig(o.a);
	//o.descend(o.a);
    //o.small(o.a);
	//o.repeat(o.a);
}
}