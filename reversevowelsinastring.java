import java.util.*;
public class reversevowelsinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("amepsumniev");
		//StringBuilder str1=new StringBuilder();
//		char[] vowels =new char[100];
//		int n=str.length();
//		int j=0;
//		for(int i=0;i<n;i++)
//		{
//			char c=str.charAt(i);
//			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
//			{
//				vowels[j]=c;
//				j++;
//			}
//		}
//		j = 0;
//		for(int i=n-1;i>=0;i--)
//		{
//			//j=vowels.length-1;
//			char c=str.charAt(i);
//			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
//			{
//				str.deleteCharAt(i);
//				str.insert(i,vowels[j]);
//				j++;
//			}
//		}
//		System.out.println(str);
		
		int a=0;
		int b=str.length()-1;
		
		for(int i=0;i<str.length();i++)
		{
			char c1=str.charAt(a);
			char c2=str.charAt(b);
			if(c1!='a' || c1!='e' || c1!='i' || c1!='o' || c1!='u' )
				a++;
			if(c2!='a' || c2!='e' || c2!='i' || c2!='o' || c2=='u' )
				b--;
			if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u' && c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u' )
			{
				char temp=c1;
				c1=c2;
				c2=temp;
				
				a++;
				b--;
			}
		}
		System.out.println(str);
		}
	
	

}
