//package dataStructureStacks;
//
//	import java.util.*;
//	import java.lang.*;
//	import java.io.*;
//
//	class balancedBrackets {
//		public static void main (String[] args) {
//		    Scanner sc=new Scanner(System.in);
//		    int t=sc.nextInt();
//		    sc.nextLine();
//		    while(t--!=0)
//		    {
//		        String str=sc.nextLine();
//		        if(isbalanced(str)==true)
//		            System.out.println("balanced");
//		        else
//		            System.out.println("not balanced");
//		    }
//		}
//		static boolean isbalanced(String str)
//		{
//		    char ch[]=str.toCharArray();
//		    AStack<Character> s=new Stack<Character>();
//		    for(int i=0;i<ch.length;i++)
//		    {
//		        if(ch[i]=='('||ch[i]=='{'||ch[i]=='[')
//		        {
//		            s.push(ch[i]);
//		        }
//		        if(ch[i]==')'||ch[i]=='}'||ch[i]==']')
//		        {
//		            if(s.isEmpty()==true)
//		            return false;
//		            if(match(s.pop(),ch[i])==false)
//		            return false;
//		        }
//		     }
//		    if(s.isEmpty()==false)
//		    return false;
//		    else
//		    return true;
//		}
//		static boolean match(char a,char b)
//		{
//		    if(a=='('&&b==')')
//		    return true;
//		    else if(a=='{'&&b=='}')
//		    return true;
//		    else if(a=='['&&b==']')
//		    return true;
//		    else
//		    return false;
//		}
//		
//	}
