import java.util.*;
public class reverseWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="quick brown fox jumped";
		String s[]=str.split(" ");
		String reverse="";
		for(String a:s)
		{
			StringBuilder b=new StringBuilder(a);
			b.reverse();
			reverse+=b.toString()+" ";
			
		}
		System.out.print(reverse);
System.out.println();
		String c="";
		for(int i=s.length-1;i>=0;i--)
		{
			c+=s[i]+" ";
		}
		System.out.println(c);
	}

}
