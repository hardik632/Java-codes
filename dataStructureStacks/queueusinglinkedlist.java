package dataStructureStacks;

public class queueusinglinkedlist {
	
	static Node head;
	class Node
	{
		
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	void enque(int data)
	{
		Node temp=new Node(data);
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
	int deque()
	{
		int temp=head.data;
		if(head==null)
		{
			return -1;
		}
		else
		{
			head=head.next;
		}
	return temp;
	}
	void display()
	{
		Node n=head;
		System.out.print("queue is: ");
		if(head==null)
		{
			System.out.println("0 element");
		}
		
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueusinglinkedlist obj=new queueusinglinkedlist();
		obj.enque(1);
		obj.enque(2);
		obj.enque(3);
		obj.enque(4);
		obj.enque(5);
		obj.display();
		System.out.println("dequeue:"+obj.deque());
		obj.display();
		System.out.println("dequeue:"+obj.deque());
		obj.display();
		System.out.println("dequeue:"+obj.deque());
		obj.display();
		System.out.println("dequeue:"+obj.deque());
		obj.display();
		System.out.println("dequeue:"+obj.deque());
		obj.display();


	}

}
