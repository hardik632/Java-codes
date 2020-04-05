package dataStructures;

import java.util.LinkedList;

//public class Graphs {
//	int v;
//	int[][] mat;
//	Graphs(int a)
//	{
//		v=a;
//		mat=new int[v][v];
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Graphs g=new Graphs(5);
//		g.addedge(0,1,10);
//		g.addedge(0,2,11);
//		g.addedge(0,3,12);
//		g.addedge(0,4,13);
//		g.addedge(4,2,14);
//		g.addedge(4,3,15);
//		g.print();
//
//	}
//
//	private void print() {
//		// TODO Auto-generated method stub
//		for(int i=0;i<5;i++)
//		{
//			System.out.print(i);
//			for(int j=0;j<5;j++)
//				
//			{
//				if(mat[i][j]!=0)
//				System.out.print("->"+j);
//			}
//			System.out.println();
//		}
//		
//	}
//
//	private void addedge(int i, int j,int w) {
//		// TODO Auto-generated method stub
//		mat[i][j]=mat[j][i]=w;
//		
//	}
//	
//
//}

class Graphs
{
	int v;
	LinkedList<Integer> adj[];
	Graphs(int a)
	{
		v=a;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList<Integer>();
	}
	void addedge(int a,int b)
	{
		adj[a].add(b);
		adj[b].add(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graphs g=new Graphs(4);
		g.addedge(0,1);
		g.addedge(0,2);
		g.addedge(0,3);
		g.addedge(1,2);
		g.addedge(2,3);
		g.print();

	}
	private void print() {
		
					
			int c=0;
			for(LinkedList<Integer> i1:adj)
			{
				System.out.print(c++  );
				for(int x:i1)
			     
				System.out.print("->"+ x);
				
				
				System.out.println();
			}
	
				
		
			
		
		
	}
	
}