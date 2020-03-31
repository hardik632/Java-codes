package dataStructuresLinkedList;

class linkedlistNode {
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

		 public  void insert(int data)
		 {
			 Node node=new Node(data);
			 node.next=null;
			 if(head==null)
			 {
				 head=node;
			 }
			 else
			 {
				 Node n=head;
				 while(n.next!=null)
				 {
					 n=n.next;
				 }
				 n.next=node;
			 }
		 }
		 public void insertAtStart(int data)
		 {
		 Node c=new Node(data);
		 if(head==null)
		 {
			 head=c;
		 }
		// c.next=null;
		 c.next=head;
		 head=c;
		 }
		 public void insertAtEnd(int data)
		 {
			 Node node=new Node(data);
			 if(head==null)
			 {
				 head=node;
			 }
			 else
			 {
				 Node temp=head;
				 while(temp.next!=null)
				 {
					 temp=temp.next;
				 }
				 temp.next=node;
			 }
		 }
		public void insertAtIndex(int data,int index)
		 {
			Node n=new Node(data);
			 n=head;		
			if(index==0)
			{
				insertAtStart(data);
			}
			else
			{
			Node d=head;
			for(int i=0;i<index-1;i++)
			{
				d=d.next;
			}
			n.next=d.next;
			d.next=n;
		 }	
		 }
		 public void show()
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
		
		linkedlistNode l=new linkedlistNode();
		l.insert(12);
		l.insert(13);
		l.insert(14);
		l.insertAtStart(11);
		l.insertAtEnd(15);
		//l.insertAtIndex(101,0);
		l.show();

	}

}

