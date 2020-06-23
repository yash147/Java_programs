class AryMul
{
int r,c;
int arr[][];
AryMul()
{
java.util.Scanner sc = new java.util.Scanner(System.in);
 System.out.println("Enter Elements");
 r=sc.nextInt();
 c=sc.nextInt();
 System.out.println("Enter"+r+"*"+c+"Elements");
for(int i=1;i<=r;i++)
{
	for(int j=1;j<=c;j++)
	
	{
	arr[i][j]=sc.nextInt();
	
	}
	System.out.println("");
}
}
		void show(int arr[][])
		{
			for(int i=1;i<=r;i++)
			{
				for(int j=1;j<=c;i++)
				{
				System.out.println(arr[i][j]+" ");
				}
				System.out.println("");
			}
		
		}
public static void main(String ff[])
{
AryMul obj= new AryMul();
obj.show(obj.arr);
}


}