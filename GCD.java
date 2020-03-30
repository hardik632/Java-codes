import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=0;
		for(int i=1;i<=a||i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("gcd of two numbers "+a+", "+b+" is: "+gcd);
		
	}

}
