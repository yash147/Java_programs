import java.util.StringTokenizer;
class Token
{
public static void main(String f[])
{
StringTokenizer st= new StringTokenizer("we are learning,java",",");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}