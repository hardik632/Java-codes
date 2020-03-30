import java.util.HashMap;
import java.util.LinkedHashMap;

public class printUniqueCharacter {
	public static void main(String args[])
	{
		String str="helo";
		LinkedHashMap<Character,Integer> h=new LinkedHashMap<Character,Integer>();
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(h.containsKey(c[i]))
			{
				h.put(c[i],h.get(c[i])+1);
			}
			else
			{
				h.put(c[i],1);
			}
		}
		System.out.print(h);
		
		int flag=1;
		char z = 0;
		for(char i : h.keySet()) {
			
			if(h.get(i)==1)
			{
				flag=0;
				z=i;
			}	
			break;
		}
		System.out.println();
		if(flag==0)
		{
			System.out.println(str.indexOf(z));
		}
				
	}
	
}
/*
 * class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> l=new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
            l.add(""+i);
        }
        Collections.sort(l);
        
        List<Integer> l1=new ArrayList<Integer>();
        for(String s: l)
        {
            l1.add(Integer.valueOf(s));
        }
       return l1;
    }
    
}*/
