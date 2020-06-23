class Dummy
{
void display()
{
System.out.println("This is display from Dummy...");
}
}
class Demo extends Dummy
{
void show()
{
System.out.println("This is show from Demo");
}
public static void main(String gg[])
{
Demo d=new Demo();
d.display();
d.show();
}
}
class Main extends Dummy
{
void show()
{
System.out.println("This is show from main class");
}
public static void main(String ff[])
{
Demo.main(null);
Main m =new Main();
m.show();
m.display();
}
} 