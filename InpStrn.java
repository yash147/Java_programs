import java.io.File;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
class InptStrm
{
public static void main(String ss[])
{
File f= new File("F:\\yash.txt");
if(f.exists())
{
try
{
FileInputStream f1 =new FileInputStream(f);
if(f.canRead())
{
int i;
String s="";
while(i=f1.read(1!=-1))
{
s=s+(char)i;
System.out.println("data in file is ="+s);
}
}
else
{
System.out.println("Unable to read....");
}
f1.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
}