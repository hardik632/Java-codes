import java.util.*;
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String reverse=new String();
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}

}
