import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
class Wrttfile
{
	public static void main(String args[])
	{
	File f = new File("F:\\yash.txt");
	if(f.exists())
	{
	
		try
		{
		
			//FileOutputStream f1 = new FileOutputStream(f);
			FileInputStream f2 =new FileInputStream(f);
			if( f.canRead())
			{
				//String s = "we are learning java..";
				 //byte b[]= s.getBytes();
				 //f1.write(b);
				String s ="";
				int i;
				while((i=f2.read())!=-1)
				{
				s=s+(char)i;
				}
				System.out.println("Data in file is= "+s);
			}
			else
			{
			System.out.println("Unable to read....at this moment..");
			}
			f2.close();
			}
			
			catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	else
			{
			System.out.println("File does not exists...");
			}
}
}