package dataStructures;

import java.util.Scanner;

public class closetPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		find(n);

	}
	static boolean checkPalindrome(int n)
	{
		boolean flag=false;
		int num=n;
		int temp=num;
		int last;
		int rev = 0;
		while(temp!=0)
		{
			last = temp%10;
			rev=(rev*10)+last;
			temp=temp/10;
		}
		if(rev==num)
			return true;
		return false;
		
	}
	private static void find(int n) {
		// TODO Auto-generated method stub
		int num=n;
		int temp=num;
		num=temp-1;
		while(!checkPalindrome(num))
		{
			num=num-1;
		}
		int b=num;
		num=temp+1;
		while(!checkPalindrome(num))
		{
			num=num+1;
		}
		int f=num;
		num=temp;
		if((num-b)<(f-num))
		{
			System.out.println(b);
		}
		else if((num-b)>(f-num))
		{
			System.out.println(f);
		}
		else
		{
			System.out.println(b+" "+f);
		}
	}

}
