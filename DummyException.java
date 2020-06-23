class DummyException extends Exception
{
    String n="java.lang.DummyException:";
	DummyException()
	{
	n=n+"/ by zer0";
	}
	DummyException(String n)
	{
	this.n=this.n+n;
	}
public String toString()
{
	return n;
}	
}
class Demo
{
	static void div() throws DummyException
{
	java.util.Scanner sc =new java.util.Scanner(System.in);
	int i=sc.nextInt();
	int j=sc.nextInt();
	if(j==0)
	{
	throw new DummyException();
	}
	else
	{
	int c=i/j;
	System.out.println("div is="+c);
	}
}
}
class Main 
{
public static void main(String gg[])
{
Demo d=new Demo();
try
{
Demo.div();
}
catch(DummyException e)
{
System.err.println("Same to same veea");
}
}
}