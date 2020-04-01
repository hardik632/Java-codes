package dataStructureStacks;

import java.util.HashSet;

public class hashsetduplicatestring {
	public static void main(String args[])
	{
		System.out.println(check("hello"));
	}
	static boolean check(String str)
	{
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(hs.add(str.charAt(i))==false)
				return false;
		}
		return true;
	}

}
