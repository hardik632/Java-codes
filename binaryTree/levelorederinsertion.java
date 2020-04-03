package binaryTree;

import java.util.*;

//class Node
//{
//	Node left;
//	Node right;
//	int data;
//	Node(int data)
//	{
//		this.data=data;
//	}
//	
//}

public class levelorederinsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {11,12,13,14,15,16,17};
		Node root=null;
		int i=0;
		root=levelOrderInsertion(root , a,i);
		System.out.println("no of nodes: " + noOfNodes(root));
		levelOrderInsertionDisplay(root);;
	}
	static Node levelOrderInsertion(Node root, int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			root=new Node(a[i]);
			root.left=levelOrderInsertion(root.left,a,2*i+1);
			root.right=levelOrderInsertion(root.right,a,2*i+2);
		}
		return root;
	}
	static int noOfNodes(Node root)
	{
	if(root==null)
		return 0;
	return 1+noOfNodes(root.left)+noOfNodes(root.right);
		}


	static void levelOrderInsertionDisplay(Node root)
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(q.isEmpty()==false)
		{
			Node temp=q.poll();
			if(temp==null)
			{
				System.out.print("$ ");
				if(q.isEmpty()==false)
				{
					q.add(null);
				}
			}
			else
			{
			System.out.print(temp.data+" ");
			
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
		}
		}
	
}
}