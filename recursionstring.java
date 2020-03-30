
public class recursionstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="axvmxvnp";
		String ans = "";
		//shiftatend(str,0, ans);
		String str1="12pi34pi";
		replacepi(str1,0,ans);
	}

	
	private static void replacepi(String str1 ,int count, String ans) {

		if(str1.length()==0)
		{
			System.out.print(ans);
			for(int i=0;i<count;i++)
				System.out.print(str1.valueOf(3.14));
			return;
		}
		char c=str1.charAt(0);
		char c1=str1.charAt(1);
		if(c == 'p' && c1== 'i')
		{
			replacepi(str1.substring(2),count+1,ans);
		}
		else
		{
			replacepi(str1.substring(1),count,ans+c);
		}
		
		
	}


	private static void shiftatend(String str,int count,String ans ) {
		// TODO Auto-generated method stub
	
	if(str.length()==0)
		{
			System.out.print(ans);
			for(int i=0;i<count;i++)
				System.out.print('x');
			return;
		}

	char c=str.charAt(0);
		if(c=='x')
		{
			shiftatend(str.substring(1),count+1, ans);
		}
		else
		{
		shiftatend(str.substring(1),count, ans+c);
	}
		
}
}
