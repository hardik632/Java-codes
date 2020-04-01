import java.util.*;
class MinimumParanthesisReverseGetABalancedParanthasis
{
	public static int printAnswer(String Stack)
	{
	    int op=0;
	    int cp=0;
		char ch[] = Stack.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		    if(ch[i]=='(')
		    {
		        op++;
		    }
		   else if(ch[i]==')' && op>0)
		    {
		        op--;
		    }
		    else
		    cp++;
		  
	    }

	    int ans = (cp/2 + op/2);
	    	    
	    if(cp%2!=0)
	    {
	        ans+=2;
	    }
	    return ans;
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String Stack = in.next();
        System.out.print(printAnswer(Stack));
        in.close();
	}
}