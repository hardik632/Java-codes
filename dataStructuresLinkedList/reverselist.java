package dataStructuresLinkedList;

public class reverselist {
	static Node head;
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
		}
	}
	void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=temp;
		}
	}
	void reverseNodes()
	{
		Node curr=head;
		Node next=null;
		Node prev=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	void show()
	{
		Node n=head;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println(n.data);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverselist obj=new reverselist();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.reverseNodes();
		obj.show();
		

	}

}
