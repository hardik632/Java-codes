package binaryTree;

class Node
{ 	
	int data;
	Node left;
	Node right;
	Node next;
	Node(int d)
	{
		data=d;
	}
}
public class binarytreenode {
	
	static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(7);
		root.left.left=new Node(6);
		root.left.right=new Node(1);
		root.right.right=new Node(5);
		root.right.right.right=new Node(9);
		System.out.println("Total number of nodes are: "+noOfNodes(root));
		System.out.println("Total number of Leaf nodes are: "+noOfLeafNodes(root));
	}
	static int noOfNodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+noOfNodes(root.left)+noOfNodes(root.right);
	}
	static int noOfLeafNodes(Node root)
	{
		if(root==null)
			return 0;
		if(root.left==null&&root.right==null)
			return 1;
		
		return noOfLeafNodes(root.left)+noOfLeafNodes(root.right);
	}


}
