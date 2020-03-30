
public class commonprefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1="hello";
		String b="heoll";
		String[] a=new String[] {"geeksfor", "geeks","geek","geezer"};
		
		String commonPrefix=findCommonPrefix(a[0],a[1]);
		for(int i=2;i<a.length;i++)
		{
			commonPrefix=findCommonPrefix(commonPrefix,a[i]);
		}
		System.out.println(commonPrefix);

	}

	private static String findCommonPrefix(String string, String string2) {
		// TODO Auto-generated method stub
		String commonprefix="";
		for(int i=0;i<string2.length();i++)
		{
			if(string.charAt(i)==string2.charAt(i))
				commonprefix+=string2.charAt(i);
			else
				break;
		}
		
		return commonprefix;
	}

}
