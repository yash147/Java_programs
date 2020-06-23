class Demo<T>
{
	T a;
	void setValue(T a)
	{
	this.a=a;
	}
	T getValue()
	{
	 return a;
	}
	
	public static void main(String args[])
	{
	Demo<String> d= new Demo<String>();
	d.setValue("Hello");
	//d.setValue(10);
	String s=d.getValue();
	System.out.println(s);
	
	}
	
}