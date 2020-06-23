import java.io.File;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
class Fileo
{
	public static void main(String gg[])
	{
		File f1=new File("F:\\yashu.txt");
		File f2=new File("F:\\yash2.txt");
		if(f1.exists()||f2.exists())
		{
			System.out.println("File already exists...");
		}
		else
		{
			try
			{
				FileOutputStream fo1= new FileOutputStream(f1);
				FileOutputStream fo2= new FileOutputStream(f2);
				if(f1.canWrite()&&f2.canWrite())
				{
				ByteArrayOutputStream ba=new ByteArrayOutputStream();
				String s="Hellojava";
				byte arr[]=s.getBytes();
				ba.writeTo(fo1);
				ba.writeTo(fo2);
				System.out.println("Writing done...");
				}
				else
				{
				System.out.println("Unable to write...");
				}
			fo1.close();
			fo2.close();
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}		
		
		}
	   
	}
}