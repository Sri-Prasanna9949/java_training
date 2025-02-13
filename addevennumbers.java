public class Main
{
	public static void main(String[] args) {
		int ip = 123456;
		int rem;
		int count=0;
		while(ip>0)
		{
		    rem=ip%10;
		    ip=ip/10;
		    if(rem%2==0)
		    {
		        count=count+rem;
		    }
		    else
		    {
		       continue; 
		    }
		}
		System.out.println(count);
	}
}