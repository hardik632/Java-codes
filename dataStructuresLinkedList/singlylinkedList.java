//Each commit is identified in git by a unique ID, also known as SHA.
//Every time a commit is made in git , that commit is assigned a unique ID or SHA. 
//Using this unique ID, one commit can be distinguished from other commits.
package dataStructuresLinkedList;

public class singlylinkedList {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	 public  void insertAtEnd(int data)
	 {
		 Node node=new Node(data);
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
	 public void insertAtBegin(int d)
	 {
		 Node temp=new Node(d);
		 if(head==null)
			 head=temp;
		 else {
			 temp.next=head;
		 	 head=temp;
		 }
	 }
	 public void insertAtIndex(int index,int data)
	 {
		 Node temp=new Node(data);
		 if(index==0)
		 {
			 insertAtBegin(data);
		 }
		 else
		 {
			 Node n=head;
			 for(int i=0;i<index-1;i++)
			 {
				n=n.next;
			 }
			temp.next=n.next;
			n.next=temp;
		 }
	 }
 public void display()
	 {
		 Node n=head;
		 while(n.next!=null)
		 {
			 System.out.print(n.data+" ");
			 n=n.next;
		 }
		 System.out.print(n.data);
	 }
	 public static void main(String[] args) {
		
		singlylinkedList obj=new singlylinkedList();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(4);
		obj.insertAtEnd(5);
		obj.insertAtBegin(0);
		obj.insertAtIndex(3,3);
		obj.display();

	}

}
