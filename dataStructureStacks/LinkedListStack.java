package dataStructureStacks;

public class LinkedListStack {
	static Node head;
	class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
		}
	}
	void push(int x)
	{
		Node temp=new Node(x);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
	}
	int pop()
	{
		if(head==null)
		{
			System.out.println("no element");
		}
		head=head.next;
		return head.data;
	}
	void display()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack obj=new LinkedListStack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		
		obj.display();
		System.out.println("pop: "+obj.pop());
		obj.display();
		

	}

}
