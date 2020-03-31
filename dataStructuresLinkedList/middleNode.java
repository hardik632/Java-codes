package dataStructuresLinkedList;

public class middleNode {
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
	public void insert(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	public void findMiddle()
	{
		Node slow=head;
		Node fast=head;
		
		Node slow1=head;
		Node fast1=head;
		while(fast1.next.next!=null )
		{
			slow1=slow1.next;
			fast1=fast1.next.next;
		}
		System.out.println(slow1.data+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		middleNode obj=new middleNode();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
		obj.findMiddle();
		

	}

}
