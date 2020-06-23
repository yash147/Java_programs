import java.util.Scanner;
public class Area
{
public static void main(String args[])
{
int l,b,c; 
System.out.println("Program for Area of ractangle....");

Scanner t=new Scanner(System.in);
System.out.println("Enter length of rectangle...");
 l=t.nextInt();
System.out.println("Enter breadth of rectangle...");
 b=t.nextInt();
 c=0.5*l*b;
System.out.println("Addition is = "  +c);
}
}