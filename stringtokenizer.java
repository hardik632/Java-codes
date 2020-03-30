import java.util.StringTokenizer;

public class stringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="he is gentle man";
		StringTokenizer st=new StringTokenizer(s," ");
		System.out.println("the tokens are: ");
		while(st.hasMoreTokens())
		{
			String one =st.nextToken();
			System.out.println(one);
		}

	}

}
