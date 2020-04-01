package dataStructureStacks;

import java.util.Scanner;

public class StackPushPop {
	int top;
	int[] ar=new int[100];
	StackPushPop()
	{
		top=-1;
		ar=new int[10];
	}
	
	void push(int x)
	{
		if(top== ar.length-1)
		{
			System.out.println("overflow");
			return;
		}
		top++;
		ar[top]=x;
		
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("underflow");
		}
		int answer=ar[top];
		top--;
		return answer;
	}	
	int peek()
	{
		if(top==-1)
		{
			System.out.println("empty stack");
		}
		return ar[top];
	}
	
	void print()
	{
		if(top==-1)
		{
			System.out.println("empty stack");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(ar[i]);
			}
		}
	}

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);

	StackPushPop obj=new StackPushPop();
	obj.push(1);
	obj.push(2);
	obj.push(3);
	obj.push(4);
	obj.push(5);
	obj.print();
	System.out.println("pop: "+obj.pop());
	System.out.println("peek: "+obj.peek());
	obj.print();
	System.out.println("pop: "+obj.pop());
	System.out.println("peek: "+obj.peek());
	obj.print();
	System.out.println("pop: "+obj.pop());
	System.out.println("peek: "+obj.peek());
	obj.print();
	System.out.println("pop: "+obj.pop());
	System.out.println("peek: "+obj.peek());
	obj.print();
	System.out.println("pop: "+obj.pop());
	obj.print();
	
}
	/*
	
	 */
	

}
