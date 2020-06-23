final class Demo
{
static int a;
 static int b;
static void show(int p ,int q)
{
a=p;
b=q;
System.out.println(a+b+"  from Demo show ");
}
}
class Dummy extends Demo
{
void main()
{
System.out.println("This is main from Dummy");
}
public static void main(String f[])
{
Dummy d= new Dummy();
d.main();
Demo.show(10 ,10);
}
}

