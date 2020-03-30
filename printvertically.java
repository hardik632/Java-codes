import java.util.ArrayList;
import java.util.List;

public class printvertically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="to be or not to be";
		String[] a=s.split(" ");
		List<String> ans = new ArrayList<String>();
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		int max=0;
		for(String str:a)
		{
			if(str.length()>max)
			{
				max=str.length();
			}
		}
		int j=0;
		while(j<max)
		{
			String ss = new String();
			for(int i=0;i<a.length;i++)
			{
				if(j<a[i].length())
				{
					ss+=a[i].charAt(j);
				}
				else
					ss+=" ";
			}
			ans.add(ss); 
			j++;
			
		}
		System.out.print(ans);
	}

}
