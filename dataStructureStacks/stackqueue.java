package dataStructureStacks;

import java.util.LinkedList;
import java.util.Queue;

public class stackqueue {
static Queue<Integer> q=new LinkedList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(10);
		push(20);
		push(30);
		push(40);
		System.out.println(pop());

	}
	static void push(int a)
	{
		q.add(a);
		int n=q.size();
		while(n>1)
		{
			q.add(q.poll());
			n--;
		}
		
	}
	static int pop()
	{
		if(q.isEmpty())
		{
			return -1;
		}
		
		return q.poll();
		
	}

}
