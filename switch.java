import java.util.Scanner;

public class Switch
{
public static void main(String args[])
{
int a,b,c,d;

Scanner t=new Scanner(System.in);
System.out.println("Enter first number..");
a=t.nextInt();
System.out.println(" You just Entered "+a);
System.out.println("Enter second number..");
b=t.nextInt();
System.out.println(" You just Entered "+b);
System.out.println("choise...");
System.out.println("1.For addition");
System.out.println("2.For multiplication");
System.out.println("3.For division");
System.out.println("4.For Subtraction");

c=t.nextInt();

switch(c)
{
case 1:
System.out.println("addition.....");
d=a+b;
System.out.println(+d);
break;
case 2:
System.out.println("multipication.....");
d=a*b;
System.out.println(+d);
break;
case 3:
System.out.println("division.....");
d=a/b;
System.out.println(+d);
break;
case 4:
System.out.println("subtraction.....");
d=a-b;
System.out.println(+d);
break;
default:
d=0;
break;
}
}
}
