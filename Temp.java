package practice;
import java.util.Scanner;
public class Temp {

	public static void main(String[] args) 
	{
	   double a,c;
	  System.out.println("Enter tempreture in ferenhite to convert it into celcius..");
     Scanner t=new Scanner(System.in);
     a=t.nextInt();
     System.out.println("you just Entered "+a);
     c=(5*(a-32))/9;
     System.out.println("Temp in celcius  "+c);
	}

}
