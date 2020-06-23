import java.io.File;
import java.io.FileOutputStream;
class Fileo
{
	public static void main(String kk[])
	{
	File f= new File("F:\\YASh.txt");
		if(f.exists())
		{
		System.out.println("File already exists");
	}
	else
	{
		try
		{
		FileOutputStream f1 =new FileOutputStream(f);
			if(f.canWrite())
			{
			String b="we are learning java";
			byte d[]=b.getBytes();
			System.out.println(b);
			}
			else
			{
			System.out.println("Unable to write in to the file");
			f1.close();
			}
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	}
}