import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int n=sc.nextInt();
		int rev=0;
		int last=0;
		int temp=n;
		while(temp>0)
		{
			last=temp%10;
			rev=(rev*10)+last;
			temp=temp/10;
		}
		System.out.println(rev);
		if(rev==n)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");

		}

	}

}
