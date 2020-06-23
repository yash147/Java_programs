import java.util.Scanner;
public class Circle
{
public static void main(String args[])
{
double c,b,z=3.14;
 
System.out.println("Program for Area of circle....");

Scanner t=new Scanner(System.in);
//System.out.println("Enter length of rectangle...");
 //=t.nextInt();
System.out.println("Enter radius of cicle...");
 b=t.nextInt();
 c=(z*b)*b;
System.out.println("Area is = "  +c);
}
}