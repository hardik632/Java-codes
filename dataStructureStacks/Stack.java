package dataStructureStacks;
import java.util.*;
class Stack
{
   int n;
   int arr[];
   int top;
   Stack(int n)
   {
       top=-1;
       arr=new int[n];
      
   }
   void push(int[] a)
   {
       if(top==arr.length-1)
       {
           System.out.println("overflow");
       }
       
        
      
       for(int i=0;i<arr.length;i++)
       {
           arr[++top]=a[i];
       }
   }
   int pop()
	{
		if(top==-1)
		{
			System.out.println("underflow");
			return -1;
		}
		//top--;
		//System.out.print(arr[top]);

		int answer=arr[top];
		top--;
		return answer;
	}	
   void display()
   {
       if(top==-1)
       {
           System.out.println("null");
       }
           else 
           {
               for(int i=top;i>=0;i--)
               {
           System.out.println(arr[i]);
               }
       }
   }
   public static void main(String[] args)
   {
     
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
         Stack s=new Stack(n);
       s.push(arr);
      s.display();
       System.out.println("pop: "+s.pop());
       s.display();
       System.out.println("pop: "+s.pop());
       s.display();
       System.out.println("pop: "+s.pop());
       s.display();
       System.out.println("pop: "+s.pop());
       s.display();
       System.out.println("pop: "+s.pop());
       s.display();
   }
}
