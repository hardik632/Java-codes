package binaryTree;

import java.util.Stack;

public class preOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.left=new Node(1);
		root.right=new Node(7);
		Stack<Node> s=new Stack<Node>();
		s.add(root.right);
		s.add(root.left);
		s.add(root);
		while(!s.isEmpty())
		{
			Node temp=s.pop();
			System.out.println(temp.data+" ");
		}
	
		
		
		

	}

}
