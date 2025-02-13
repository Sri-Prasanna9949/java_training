public class Main
{
	public static void main(String[] args)
	{
	    int n=5,i,j,k,l;
		for(i=1;i<=n;i++)
		{
		    for (j=n-1;j>=i;j--)
		    {
		       System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print("1");
		    }
		    for(l=1;l<=j;l++)
		    {
		        System.out.print("1");
		    }
		    System.out.println(" ");
		}
	}
}