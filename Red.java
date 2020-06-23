import java.util.*;
public class Red
{
public int a;
public int b;
public int c;
public void red()
{
Scanner s= new Scanner(System.in);
System.out.println("Enter first value ");
a=s.nextInt();
System.out.println("Enter second value ");
b=s.nextInt();
System.out.println(a+b);
}

public class Add extends Red
{

public void add()
{
c=a+b;
System.out.println("Addition is = "+c);
}
}
public static void main(String[]args)
{
Add  v=new Add();
v.red();
v.add();
}
}