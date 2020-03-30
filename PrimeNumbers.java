import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		
		int count=0;
		int a=0;

			for(int i=1;i<=j;i++)
			{
			   if(j%i==0)
			   {
			        count++;        
			   }
			}
     
	
		if(count==2)
		{
			System.out.println(j +" is prime number");
		}
		else
		{
			System.out.println(j +" is not prime  number");
		}
		

	}

}
