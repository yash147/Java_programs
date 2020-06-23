class Demo
{ 
int a;
Demo(int b)
{
a=b;
}
void Delta()
{
System.out.println(a*a);
}
}
class Dummy
{
public static void main(String u[])
{
Demo d=new Demo(12);
d.Delta();
}
}