class Strng
{
public static void main(String g[])
{
int k;
String s="we are learning java";
String x[]=s.split(" ");
k=s.length();
for(int i=0;i<4;i++)
{
String s1=x[i].substring(0,1);
s1=s1.toUpperCase();
String s2=x[i].substring(1);
String s3=s1.concat(s2);
System.out.print(s3+" ");
}
}
}

