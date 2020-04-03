//package binaryTree;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//class bNode
//{
//	bNode left;
//	bNode right;
//	int data;
//
//	bNode(int d)
//	{
//		data=d;
//	}
//}
//
//public class binarySearchTree {
//	 static ArrayList<Integer> list=new ArrayList<Integer>();
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		binarySearchTree obj=new binarySearchTree();
//		Scanner sc=new Scanner(System.in);
//		bNode root=null;
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++)
//		{
//			int x=sc.nextInt();
//		
//		
//			root=obj.insertInBST(root,x);
//		}
//		obj.display(root);
//		System.out.println("min: "+list.get(0)+ " max: "+ list.get(list.size()-1));
//		 obj.search(10);
//	}
//	public bNode insertInBST(bNode root ,int x)
//	{
//		if(root==null)
//		{
//			root=new bNode(x);
//			return root;
//		}
//		if(root.data>x)
//		{
//			root.left=insertInBST(root.left,x);
//		}
//		if(root.data<x)
//		{
//			root.right=insertInBST(root.right,x);
//		}
//		return root;
//	}
//	public void display(bNode root)
//	{
//	       if(root==null)
//	       {
//	           return;
//	       }
//	       display(root.left);
//	       System.out.print(root.data+" ");
//	       send(root.data);
//	       display(root.right);
//	      
//	       
//	}
//	private  void send(int data) {
//		// TODO Auto-generated method stub
//	
//		list.add(data);
//	}
//	public int search(int d)
//	{
//		int n=list.size();
//		int middle=n/2;
//		int beg=0;
//		int end=n;
//		while(beg<=end)
//		{
//			if(a[middle]==d)
//				return middle;
//		}
//		
//		
//	}
//
//	
//
//}
