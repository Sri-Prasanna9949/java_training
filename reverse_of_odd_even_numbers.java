public class Main
{
	public static void main(String[] args)
	{
		int ip = 123456;
		int rem;
		int even=0;
		int odd=0;
		while(ip>0)
		{
		    rem=ip%10;
		    ip=ip/10;
		    if(rem%2==0)
		    {
		        even=even*10+rem;
		    }
		    else{
		        odd=odd*10+rem;
		    }
		}
		System.out.println(even);
		System.out.println(odd);
		System.out.println("Reverse of even");
		reverse(even);
		System.out.println("Reverse of odd");
		reverse(odd);
	}
	static void reverse(int x)
	{
	    int rev=0;
	    int r;
	    while(x>0)
	    {
	        r=x%10;
	        x=x/10;
	        rev=rev*10+r;
	    }
	    System.out.println(rev);
	}
}