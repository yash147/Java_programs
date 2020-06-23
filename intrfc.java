interface Demo
{
void show();
}
class Aa implements Demo
{
public void show()
{
System.out.println("This is class Aa");
}
}
class Bb implements Demo
{
public void show()
{
System.out.println("This is class Bb");
}
}
class Cc implements Demo
{
public void show()
{
System.out.println("This is class Cc");
}
}
class Dummy
{
static Demo display(String n)
{
if(n.equals("A"))
{
return new Aa();
}
else if(n.equals("B"))
{
return new Bb();
}
else
{
return new Cc();
}
}
}
class Main
{
public static void main(String args[])
{
Demo d=Dummy.display("A");
d.show();
}
}