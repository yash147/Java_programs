class Exc
{
	void show()
	{
	System.out.println("show is running....");
	}
	public static void main(String gg[])
	{
	try
	{
	Exc f= new Exc();
	f=null;
	f.show();
	}
	catch(NullPointerException d)
	{
	System.out.println("refrence variable storing NULL");
	}
}
}