import java.util.*;
public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="helloo";
		int k=3;
		int n=str.length();
//		
//		String a="apxm";
//		String b="abc";
//		String[] arr=new String[]{};
//		for(int i=0;i<a.length()&& i<b.length();i++)
//		{
//			if(a.charAt(i)==b.charAt(i))
//			{
//				continue;
//			}
//			else
//			{
//				if(a.compareTo(b)>0)
//				{
//					System.out.println(a+" will come later");
//					break;
//				}
//				else if(a.compareTo(b)>0)
//				{
//					System.out.println(b+ " will come later");
//				}
//				else
//				{
//					System.out.println("same order");
//				}
//			}
//		}
//	}
//}

		String[] arr=new String[]{"hello", "google" ,"poppy"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;i<arr.length;i++)
			{
				if(fun(arr[i],arr[j]))
				{
					String s=arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static boolean fun(String string, String string2) {
		// TODO Auto-generated method stub
		if(string.compareTo(string2)>0)
			return true;
		return false;
	}
}
