class Student
{
int rno;
String name;
static String clg ="ITS";

Student(int r,String s)
{
rno=r;
name =s;
}
void display()
{
System.out.println(rno +" "+name+" "+clg);
}
public static void main(String hh[])
{
Student s1=new Student(1,"yash");
Student s2=new Student(2,"nikhil");
s1.display();
s2.display();
}
}
