class ChReverse
{

static String s;
/*ChReverse()
{
System.out.println("Enter a string");
java.util.Scanner sc =new java.util.Scanner(System.in)
 s=sc.next();
}
*/
String stringReverse(String s)
{
    int e=0;
	String l="";
	char arr[]=s.toCharArray();
	for(char i:arr)
	{
	//System.out.print(i);
	e++;
	}
		for(int j=e-1;j>=0;j--)
	{
	//System.out.print(arr[j]);
     l=l.concat(Character.toString(arr[j]));
	}
	//System.out.println(l);
/*if(s.equals(l))
	{
	System.out.println("this word is palindrome");
	}
	else
	{
	System.out.println("this word is not palindrome");
	}
*/
return l;
}
public static void main(String u[])
{
ChReverse r =new ChReverse();
String st=r.stringReverse("Lamba lamba lamba ");
System.out.print(st);
}
}