package dataStructuresLinkedList;

public class detectloop {
		static Node head;
		class Node { 

			int data; 
			Node next; 

			Node(int d) 
			{ 
				data = d; 
			}

			public Node() {
				// TODO Auto-generated constructor stub
			} 
		} 
		void insert(int data)
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

		int detectAndRemoveLoop() 
		{ 
			Node slow = head, fast = head; 
			while (slow != null && fast != null && fast.next != null) { 
				slow = slow.next; 
				fast = fast.next.next; 

				if (slow == fast) { 
					removeLoop(slow); 
					return 1; 
				} 
			} 
			return 0; 
		} 

		 void removeLoop(Node loop) 
		 
		{ 
			Node ptr1 = null, ptr2 = null; 
			
			Node curr = null;
			ptr1 = curr; 
			while (1 == 1) { 

				ptr2 = loop; 
				while (ptr2.next != loop && ptr2.next != ptr1) { 
					ptr2 = ptr2.next; 
				} 


				if (ptr2.next == ptr1) { 
					break; 
				} 

				ptr1 = ptr1.next; 
			} 
			ptr2.next = null; 
		} 
		
		void printList() 
		{ 
			Node node=new Node();
			while (node.next != null) { 
				System.out.print(node.data + " "); 
				node = node.next; 
			} 
			System.out.println(node.data);
		} 

		public static void main(String[] args) 
		{ 
			detectloop list = new detectloop(); 
			list.insert(1);
			
			list.insert(11);

			list.insert(111);

			list.insert(1111);

			list.insert(11111);

			list.insert(111111);

			list.insert(1111111);

			list.detectAndRemoveLoop();  
			list.printList(); 
		} 
	}
