class Stng
{ 
public static void main(String fab[])
{
String f="we are here to learning java";
String result="";
String arr[]=f.split(" ");
int count=0;
for(String i:arr)
{
String s=arr[count];
String s1=s.substring(0,1);
s1=s1.toUpperCase();
String s2=s.substring(0,1);
 s2=s.replace(s2,s1);
 arr[count]=s2.concat(" ");
 result=result.concat(arr[count]);
 count++;
 }
System.out.println(result);
}
}