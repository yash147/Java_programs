void main()
{
int i,j,o=5,k=3,l=3;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;j++) //y
		 {   
		 	
		 	if(i==j&&i<=3||j==o)
		 	{
		 		printf("*");
			}
			else
			 {
			 printf(" ");
			 }		 
		}
		if(o>3)
		{
		o--;
		}
		
		for(j=1;j<=2;j++)
		{
			printf(" ");
		}
		
		for(j=1;j<=5;j++) //A
		{   
		 	if(j==k||j==l||i==3)	
			 {
			 	printf("*");
			  }
			  else
			  {
			  	printf(" ");
			  	
			  }
		 
		}
	    if(k<5||l>1)
	    {
	    	l--;
			k++;
		}
		
		for(j=1;j<=2;j++)
		{
			printf(" ");
		}
		
		
		for(j=1;j<=5;j++) //s
		{   
		 	if(i%2!=0||i==2&&j==1||i==4&&j==5)	
			 {
			 	printf("*");
			  }
			  else
			  {
			  	printf(" ");
			  	
			  }
		}	
		
		for(j=1;j<=2;j++)
		{
			printf(" ");
		}		
		
		for(j=1;j<=5;j++)  //H
		{
			if(j==1||j==5||i==3)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}	
			
		
		
		
		
		}
		
		
		
	    printf("\n");
	}
}	
