 
public class stringPatternMatching {
	public static void main(String args[])
	{
			String a="abcdabcabcdf";
			String b="abcdf";
			int i=0;
			int j=0;
			int x=0;
			while(i<a.length())
			{
				j=0;
				x=i;
				while( j<b.length() && a.charAt(x)==b.charAt(j))
				{
					x++;
					j++;
					
				}
				if(j== b.length())
				{
				x=x-1;
					System.out.print(i+" "+x);
				}
				i++;
			}
		
	}

}
