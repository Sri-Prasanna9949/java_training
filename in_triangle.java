public class Main
{
	public static void main(String[] args)
	{
	    int n=4,i,j,k,l;
		for(i=1;i<=n;i++)
		{
		    for (j=n-1;j>=i;j--)
		    {
		       System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        if(k==1 || i==n)
		        {
		            System.out.print("*");
		        }
		        else{
		            System.out.print("0");
		        }
		    }
		    for(l=j;l>=1;l--)
		    {
		        if(l==1 || i==n)
		        {
		            System.out.print("*");
		        }
		        else{
		            System.out.print("0");
		        }
		    }
		    System.out.println(" ");
		}
	}
}