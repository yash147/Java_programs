import java.util.*;
class Demo
{
	public static void main(String args[])
	
	{
		String s1= new String("aaa");
		String s2= new String("ccc");	
		String s3= new String("bbb");
		String s4= new String("aaa");
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al);
		ListIterator it =al.listIterator();
		System.out.println(">>>>>");
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println("<<<<<");
		while(it.hasPrevious())
		{
		System.out.println(it.previous());
		}
	
	}


}