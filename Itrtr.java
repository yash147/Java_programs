import java.util.*;
class Itrtr
{
	public static void main(String args[])
	{
		String s1= new String("aaa");
		String s2= new String("ccc");
		String s3= new String("bbb");
		String s4= new String("aaa");
		
		//TreeSet<String> al =new TreeSet<String>();
		//ArrayList<String> al= new ArrayList<String>();
		LinkedList<String> al =new LinkedList<String>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
	
		Iterator it= al.iterator();
		
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
	
	}
	

}