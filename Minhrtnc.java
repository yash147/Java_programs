class Daddu
{
void show()
{
System.out.println("I am the boss..");
}
}
class Dad extends Daddu
{
void display()
{
System.out.println("I am your son boss..");
}
}
class Yash extends Dad
{
public static void main(String []arr)
{
Yash s=new Yash();
s.show();
s.display();
System.out.println("Who am i ..");
}

}