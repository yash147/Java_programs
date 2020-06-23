class Yes
{
void println(String n[])
{
System.out.println(n);
}
}

class Sys
{
static final Yes put = new Yes();
}

class Demo
{
public static void main(String n[])
{
Sys.put.println("Hello yash");
}
}
