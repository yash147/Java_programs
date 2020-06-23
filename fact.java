class Demo
{
public static void main(String rr[])
{
int a=15,result,first=0,second=1;
for(int i=0;i<=10;i++)
{
result=first+second;
first=second;	
second=result;
System.out.print(result);
}

}

}
