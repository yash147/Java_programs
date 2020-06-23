import java.util.*;
class Demo
{
	public static void main(String args[])
	{
	 TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
	 
	tm.put(101,"Yash");
	tm.put(102,"yashu");
	tm.put(103,"Yug");
	
	for(Map.Entry i: tm.Enteryset())
	{
	System.out.println(i.getKey()+" "+i.getValue());
	}
	
	}

}