package dataStructureStacks;

import java.util.Scanner;

public class queue {

	
	int [] arr;
	int front,rear;
	queue()
	{
		arr=new int[100];
		front=rear=-1;
	}
	
	void enqueue(int x)
	{
		if(rear==arr.length)
		{
			System.out.println("overflow");
		}
		rear++;
		arr[rear]=x;
		if(rear==0)
			front=0;
		
	}
	
	int dequeue()
	{
		
		if(front==-1)
		{
			System.out.println("underflow");
		}
		int temp=arr[front];
		if(front==rear)
		{
			front=rear=-1;
		}
		else
		{
			front++;
		}
		return temp;
	}
	void display()
	{
		if(front==-1&&rear==-1)
		{
			System.out.println("no element");
		}
		System.out.print("queue is: ");
		for(int i=front;i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue obj=new queue();
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);
		obj.display();
		System.out.println("dequeue:"+obj.dequeue());
		obj.display();
		System.out.println("dequeue:"+obj.dequeue());
		obj.display();
		System.out.println("dequeue:"+obj.dequeue());
		obj.display();
		System.out.println("dequeue:"+obj.dequeue());
		obj.display();
		

		
		

	}

}
