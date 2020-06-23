import java.util.*;
class Maap
{
	public static void main(String args[])
	{
	 TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
	 
	tm.put(101,"Yash");
	tm.put(102,"yashu");
	tm.put(103,"Yug");
	
	for(Map.Entry i: tm.enterySet())
	{
	System.out.println(i.getKey()+" "+i.getValue());
	}
	
	}

}