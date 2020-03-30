import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string: ");
		String s=sc.nextLine();
		String temp=new String(s);
		String rev=new String();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(temp))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
