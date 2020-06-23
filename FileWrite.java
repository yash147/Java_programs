import java.io.File;
import java.io.FileWriter;

class FileWrite
{
public static void main(String ss[])
{
try
{
FileWriter fw =new FileWriter("F:\\FileWrite.txt");
String s="This is a program for FIle writer";
fw.write(s);
fw.close();
System.out.println("Writing done....");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}