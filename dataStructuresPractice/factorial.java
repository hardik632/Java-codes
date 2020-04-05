package dataStructures;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		factorial f=new factorial();
		System.out.println(f.fact(n));
	}
		int fact(int n)
		{
			if(n==0)
				return 1;
			else
				return n*fact(n-1);
			  
		}
}
