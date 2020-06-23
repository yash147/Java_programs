class Gc
{
	public void finilize() // oovrrd frm objct class
	{
	System.out.println("Object gone....");
	}
public static void main(String args[])
	{
	Gc g = new Gc();
	Gc g1 = new Gc();
	g=null;
	g1=g;
	System.gc();
	}
}