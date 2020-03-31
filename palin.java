import java.util.*;
import java.io.*;
class Node
{
	int data;
	Node next;
	Node(int x)
	{
	data=x;
	}
}
public class palin
{
Node head;
void insert(int x)
{
	Node temp=new Node(x);
	if(head==null)
	{
		head=temp;
	}
	else
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=temp;
	}
}
int palin()
{ 
	Node temp=head;
	String str="";
   while(temp!=null)
    {
      str=str+temp.data;
      temp=temp.next;
    }
      char[] ch = str.toCharArray();
    for(int i=0;i<ch.length;i++)
     {
     	
     	  if(ch[i]==ch[ch.length-i-1])
     	  	continue;
     	  else
     	  	 return 0;
     }
     return 1;
}
void show()
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}

}

	public static void main(String args[])
	{
	 palin p=new palin();
	 p.insert(1);
	 p.insert(2);
	 p.insert(3);
	 p.insert(2);
	 p.insert(0);
	 p.show();
	 int pa=p.palin();
	 if(pa==1)
	 {
	 	System.out.println("Palindrome");
	 }
	 else
	 {
	 	System.out.println("Not Palindrome");
	 }
	}
}