import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grade {

	String name;
	int rollno,sub1,sub2,total;
	float per;void getdata() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Enter Name of Student");
		name = br.readLine();
		System.out.println ("Enter Roll No. of Student");
		rollno = Integer.parseInt(br.readLine());
		System.out.println ("Enter marks out of 100 of 1st subject");
		sub1 = Integer.parseInt(br.readLine());
		System.out.println ("Enter marks out of 100 of 2nd subject");
		sub2 = Integer.parseInt(br.readLine());
	}
	void show()
	{
		total=sub1+sub2;
		per=(total*100)/200;
		System.out.println ("Roll No. = "+rollno);
		System.out.println ("Name = "+name);
		System.out.println ("Marks of 1st Subject = "+sub1);
		System.out.println ("Marks of 2nd Subject = "+sub2);
		System.out.println ("Total Marks = "+total);
		System.out.println ("Percentage = "+per+"%");
	}
}
class q2Student
{
	public static void main(String args[]) throws IOException
	{
		student s=new student();
		s.getdata();
		s.show();
	}
}