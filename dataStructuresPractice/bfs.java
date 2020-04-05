package dataStructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
	static int v;
	int[][] mat;
	bfs(int a)
	{
		v=a;
		mat=new int[v][v];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bfs g=new bfs(6);
		g.addedge(0,1);
		g.addedge(0,2);
		g.addedge(1,3);
		g.addedge(3,4);
		g.addedge(4,5);
		g.addedge(4,2);
		g.addedge(1,4);
		g.addedge(3,5);
		//g.print();
		g.BFS(0);

	}
	private void BFS(int s) {
		// TODO Auto-generated method stub
		boolean[] visited=new boolean[v];
		Arrays.fill(visited, false);
		Queue<Integer> q=new LinkedList<>();
		q.add(s);
		visited[s]=true;
		while(q.isEmpty()==false)
		{
			int x=q.poll();
			System.out.print(x+" ");
			for(int i=0;i<v;i++)
			{
				if(mat[x][i]==0)
				{
					continue;						
				}
				if(visited[i]==false)
				{
					q.add(i);
					visited[i]=true;
				}
			}
		}
		
		
	}
	private void addedge(int i, int j) {
		// TODO Auto-generated method stub
		mat[i][j]=mat[j][i]=1;
		
	}
	

	private void print() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.print(i);
			for(int j=0;j<5;j++)
				
			{
				if(mat[i][j]!=0)
				System.out.print("->"+j);
			}
			System.out.println();
		}
		
	}

	
	
}
