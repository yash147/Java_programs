class Wrapper
{
public static void main(String k[])
{
int a=10;
//Integer b= Integer.valueOf(a);//boxing
Integer b=a;//auto boxing
System.out.println(b);
Integer i=new Integer(100);//unboxing
int j=i;//auto unboxing
System.out.println(j);
}

}