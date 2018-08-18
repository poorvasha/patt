import java.util.*;
class code
{
public static void main(String args[])
{
	int i,n,j,k;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	k=n;
	for(i=1;i<=(n*2)-1;i++)
	{
	  	if(i<=n)
	  	{
	   		for(j=1;j<=i;j++)
	     		{
			System.out.print("*");
	     		}
	   		System.out.println();
	  	 }
	  	 else
	  	 {	

			for(j=k-1;j>=1;j--)
	     		{
			System.out.print("*");
	     		}
	   		System.out.println();
			k--;
	 	}
	}
}
}

