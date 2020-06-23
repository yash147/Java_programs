class Test
{
int test_a; 
int test_b;

Test(int a, int b)
{
test_a=a;
test_b=b;
}
public static void main(String ff[])
{
Test t=new Test();
System.out.println(t.test_a+" "+t.test_b);
}
}