class CharReverse
{
static String s;
CharReverse()
{
System.out.println("Enter a string");
java.util.Scanner sc =new java.util.Scanner(System.in);
 s=sc.next();
}

String stringReverse(String s)
{
    int e=0;
	String l="";
	char arr[]=s.toCharArray();
	for(char i:arr)
	{
	e++;
	}
	for(int j=e-1;j>=0;j--)
	{
	 //System.out.print(arr[j]);
     l=l.concat(Character.toString(arr[j]));
	}
	
	System.out.println("Reverse is = "+l);
if(s.equals(l))
	{
	System.out.println("this word is palindrome");
	}
	else
	{
	System.out.println("this word is not palindrome");
	}
return l;
	}
public static void main(String u[])
{
CharReverse r =new CharReverse();
r.stringReverse(s);
}
}