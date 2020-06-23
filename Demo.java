class Psp
{
public void ppoint(String gg)
{
System.out.println(gg);
}
}
final class Sys
{
public static final Psp put =new Psp();
}
class Demo
{
public static void main(String gg[])
{
Sys.put.ppoint("this is");
}
}