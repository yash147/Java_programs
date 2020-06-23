class nik
{
int a[]={1,2,4,5};

int kal(int b[])
{
	int c=b[2];
	return c;

}
public static void main(String args[])
{
	nik n=new nik();
	int x=n.kal(n.a);
	System.out.print(x);
	
}

}