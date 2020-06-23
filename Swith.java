import java.util.Scanner;
public class Swith
{
public static void main(String args[])
{
int a,b,c,d;
Scanner t=new Scanner(System.in);
System.out.println("Enter the first number....");
a=t.nextInt();
System.out.println("Enter the second number....");
b=t.nextInt();
System.out.println("Enter your choice....");
System.out.println("1.Addition");
System.out.println("2.Subtraction...");
System.out.println("3.Multiplication");
System.out.println("4.Division");
c=t.nextInt();
switch(c)
{
case 1:
System.out.println("Addition....");
d=a+b;
System.out.println("Addition is =  "+d);
break;

case 2:
System.out.println("subtraction....");
d=a-b;
System.out.println("subtraction is =  "+d);
break;

case 3:
System.out.println("multiplication....");
d=a*b;
System.out.println("multiplication is =  "+d);
break;

case 4:
System.out.println("division....");
d=a/b;
System.out.println(" division is =  "+d);
break;

default:
d=0;
System.out.println(" dumbo  "+d);
break;
}
}
}
