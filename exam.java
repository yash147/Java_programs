package practice;
import java.util.Scanner;
public class Exam {

	private static Scanner s;

	public static void main(String[] args) {
		
		double a;
		System.out.println("This is your future viewer.....");
		System.out.println("                                ");
		System.out.println("Enter your markes in under 100");
		s = new Scanner(System.in);
		a=s.nextInt();
		if(a>=95) 
		
		{
			System.out.println("Wow....No words to define you godd jod my boy or girl whatever....");
		}
		else if(a>=90) 
		
		{
			System.out.println("Wow....some words to define you ....nothing yarr");
		}
		else if (a>=80)
		{
			System.out.println("no comment.....");
			
		}
		else if (a>=70)
		{
			System.out.println("comments.....please");
			
		}
		else if (a>=60)
		{
			System.out.println("bad very bad.....");
			
		}
		else if (a>=50)
		{
			System.out.println("no....");
			
		}
		else if (a>=40)
		{
			System.out.println(".....");
			
		}
		else if (a>=33)
		{
			System.out.println("*.*");
			
		}else if (a<33)
		{
			System.out.println(" ab tera kya hoga kaliya......"
					+ "");
			
		}
		
		
		
		

	}

}
