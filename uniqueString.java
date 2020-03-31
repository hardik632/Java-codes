/*package whatever //do not write package name here */

import java.io.*;

class uniqueString {
	public static void main (String[] args) {
		String str="hardik";
	    System.out.println(check(str));
	}
	static boolean check(String str)
	
	{
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i+1;j<str.length();j++)
		    {
		        if(str.charAt(i)==str.charAt(j))
		        {
		           return false;
		        }
		    }
		}
		return true;
	}/*
	static boolean check(String str)
	{
	    str=str.toLowerCase();
	    int[] a=new int[26];
	    for(int i=0;i<str.length();i++)
	    {
	        a[str.charAt(i)-'a']++;
	    }
	    for(int i=0;i<a.length;i++)
	    {
	        if(a[i]>1)
	        {
	            return false;
	        }
	    }
	    return true;
	}
}*/