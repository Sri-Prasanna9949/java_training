public class Main
{
	public static void main(String[] args)
	{
		int ip = 123456;
		int rem;
		int evencount=0;
		int oddcount=0;
		int primesum=0;
		while(ip>0)
		{
		    rem=ip%10;
		    ip=ip/10;
		    if(rem%2!=0)
		    {
		       oddcount=oddcount+rem;  
		    }
		    else
		    {
		       evencount=evencount+rem;
		    }
        if (checkPrime(rem))
		{
		    primesum=primesum+rem;
		}
		}
		System.out.println(evencount);
		System.out.println(oddcount);
		System.out.println(primesum);
	}

		static boolean checkPrime(int x)
		{
		    int count=0;
		    for(int i=1;i<=x;i++)
		    {
		        if(x%i==0)
		        {
		            count++;
		        }
		        else{
		            continue;
		        }
		        
		        
		    }
		    if(count==2)
		        {
		            return true;
		        }
		        else{
		            return false;
		        }
		    
		}
}