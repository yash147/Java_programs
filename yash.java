class Demo
{
	

public static void main(String gg[])
{
int i,j,o=5,k=3,l=3;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;j++) //y
		 {   
		 	
		 	if(i==j&&i<=3||j==o)
		 	{
		 		System.out.print("*");
			}
			else
			 {
			 System.out.print(" ");
			 }		 
		}
		if(o>3)
		{
		o--;
		}
		
		for(j=1;j<=2;j++)
		{
			System.out.print(" ");
		}
		
		for(j=1;j<=5;j++) //A
		{   
		 	if(j==k||j==l||i==3)	
			 {
			 	System.out.print("*");
			  }
			  else
			  {
			  	System.out.print(" ");
			  	
			  }
		 
		}
	    if(k<5||l>1)
	    {
	    	l--;
			k++;
		}
		
		for(j=1;j<=2;j++)
		{
			System.out.print(" ");
		}
		
		
		for(j=1;j<=5;j++) //s
		{   
		 	if(i%2!=0||i==2&&j==1||i==4&&j==5)	
			 {
			 	System.out.print("*");
			  }
			  else
			  {
			  	System.out.print(" ");
			  	
			  }
		}	
		
		for(j=1;j<=2;j++)
		{
			System.out.print(" ");
		}		
		
		for(j=1;j<=5;j++)  //H
		{
			if(j==1||j==5||i==3)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}	
			
		
		
		
		
		}
		
		
		
	    System.out.print("\n");
	}
}
}
