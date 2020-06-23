import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class prashant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter id");
      int id=sc.nextInt();
      System.out.println("enter name");
      String name=sc.next();
      try {
      	  Class.forName("Com.mysql.jdbc.Driver");
      	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","root");
    	  
      	  String qr="insert into emp values(?,?)";
      	  PreparedStatement ps=con.prepareStatement(qr);
      	  ps.setInt(1,id);
      	  ps.setString(2,name);
      	  int i=ps.executeUpdate();
      	  System.out.println(i+"record added");
      	  con.close();
      	  }
      catch(Exception e)
      {
    	 e.printStackTrace();
      }
	}

}
