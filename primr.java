class Prime
{
public static void main(String tt[])
{
System.out.print("1 3 5 7 ");
for(int a=7;a<=100;a++)
{
if(a%2!=0&&a%3!=0&&a%5!=0&&a%7!=0)
{
System.out.print(a+" ");
}
}
}
}