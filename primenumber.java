import java.util.Scanner;

class primenumber{

	public static void main(String[] args) {

int count;
int a=0;
	for(int j=10000;j>0;j--)
	{
	count=0;
	for(int i=1;i<=j;i++)
	{
	   if(j%i==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	{ 
	    a=j;
	    break;
	      // System.out.print();     
	}
	}
	    System.out.print(a);
	}
}