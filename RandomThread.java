class Thrd implements Runnable
{
	public void run()
	{
		Thread d= new Thread();
		Thread.currentThread();
		System.out.println(d.getName());
	}

	public static void main(String ss[])
	{
		Thrd t= new Thrd();
		Thread t1= new Thread(t);
		Thread t2= new Thread(t);
		Thread t3= new Thread(t);
		
		t1.setName("yb1");
		t2.setName("yb2");
		t3.setName("yb3");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
	
	}