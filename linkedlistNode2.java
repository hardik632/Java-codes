class linkedlistNode2
{
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
    public void deleteAT(int index)
    {
        if(index==0)
        head=head.next;
        else
        {
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("n1 "+ n1.data);
            n1=null;

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
		 public void insertAtStart(int data)
		 {
		 Node c=new Node(data);
		// c.next=null;
		 c.next=head;
		 head=c;
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
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		linkedlistNode2 l=new linkedlistNode2();
		l.insert(12);
		l.insert(13);
		l.insert(14);
		l.insertAtStart(100);
        l.insertAtIndex(101,0);
        l.deleteAT(1);
		l.show();

	}

}