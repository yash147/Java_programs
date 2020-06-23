class Fabb
{
public static void main(String []yess)
{
int a=50;
int first=0,second=1,result;
System.out.println("A program for fiboancci series..");
for(int i=0;i<50;i++)
{

result=first+second;
first=second;	
second=result;
System.out.print(result);
System.out.print(" ");}

}
}