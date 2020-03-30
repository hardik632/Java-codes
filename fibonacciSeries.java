import java.util.*;
public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+1];
		System.out.println(fiboRecursion(n));
		System.out.println(fiboMemoization(n,a));
		System.out.println(fiboTabulation(n,a));
	}
	public static int fiboRecursion(int n)
	{
		if(n==0|| n==1)
		{
			return n;
		}
		return fiboRecursion(n-1)+fiboRecursion(n-2);
	}
	public static int fiboMemoization(int n,int[] dp)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		if(dp[n]!=0)
		{
			return dp[n];
		}
		
		for(int i=2;i<n+1;i++)
		{
			dp[i]=fiboMemoization(i-1, dp)+fiboMemoization(i-2,dp);
		}
		return dp[n];
	}
	public static int fiboTabulation(int n , int[] dp)
	{
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<n+1;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
	return dp[n];
	}
}
