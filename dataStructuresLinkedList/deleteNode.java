package dataStructuresLinkedList;

import dataStructuresLinkedList.linkedlistNode.Node;

public class deleteNode {
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
	public void deleteBegin() {
		
		// TODO Auto-generated method stub
		if(head==null)
		{
			System.out.println("no element to be deleted");
		}
		else
		{
			head=head.next;
		}
		
	}
	public void deleteEnd() {
		// TODO Auto-generated method stubode =null;
		if(head==null)
		{
			System.out.println("no element to be deleted");
		}
		else
		{
			Node temp=head;
			
			
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
		
	}
	public void deleteAtIndex(int index)
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("no element to be deleted");
		}
		else
		{
			if(index==0)
			{
				head=temp.next;
			}
			else
			{
				Node n=head;
				for(int i=0;i<index-1;i++)
				{
					temp=temp.next;
				}
				n=temp.next.next;
				temp.next=n;
			}
		}
	}
	
	 public void show()
	 {
		 Node n=head;
		 if(head==null)
		 {
			 System.out.print("no element to be shown");
			 return;
		 }
		 while(n!=null)
		 {
			 System.out.print(n.data+" ");
			 n=n.next;
		 }
		// System.out.println(n.data);
	 }
	 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head;
		deleteNode obj=new deleteNode();
		obj.insert(0);
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
		obj.insert(7);
		obj.insert(8);
		obj.deleteBegin();
		obj.deleteEnd();
		obj.deleteAtIndex(5);
		obj.show();

	}

	


}
