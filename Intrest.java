import java.util.*;
public class Intrest
{
public static void main(String args[])
{
double c,p,r,v,s=100;
 
System.out.println("Program for Principle intrest....");

Scanner t=new Scanner(System.in);
System.out.println("Enter P...");
p =t.nextInt();
System.out.println("Enter rate...");
 r =t.nextInt();
System.out.println("Enter time ...");
 v =t.nextInt();
 c=(p*r*v)/s;
System.out.println("Principle Intrest  is = "  +c);
}
}