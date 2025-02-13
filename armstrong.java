static boolean armstrong(int y)
	{
	    int r1;
	    int sum=0;
	    while(y>0)
	    {
	       r1=y%10;
	       y=y/10;
	       r1=r1*r1*r1;
	       sum=sum*10+r1;
	    }
	    if(sum==y)
	    {
	        return true;
	    }
	    else{
	        return false;
	    }
	}