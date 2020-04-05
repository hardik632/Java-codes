package dataStructures;

import java.util.Arrays;

public class adjancenymatrix {
	
	static int v;
	static int[][] mat;
	adjancenymatrix(int s)
	{
		v=s;
		mat=new int[s][s];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adjancenymatrix obj=new adjancenymatrix(5);
		obj.addedge(0,1,3);
		obj.addedge(1,4,1);
		obj.addedge(1,3,5);
		obj.addedge(2,3,2);
		obj.addedge(0,2,1);
		obj.addedge(1,2,7);
		obj.addedge(4,3,7);
		obj.print();
		
		System.out.print(obj.findShortestPath(v,mat,0));

	}
		private int[] findShortestPath(int v2, int[][] mat2, int i) {
		// TODO Auto-generated method stub
			int[] cost=new int[v];
			boolean[] visted=new boolean[v];
			Arrays.fill(cost, Integer.MAX_VALUE);
			Arrays.fill(visted, false);
			cost[i]=0;
			for(int i1=0;i1<v;i1++)
				{
					int min=findMin(cost,visted);
					for(int j=0;j<v;j++)
					{
						if(visted[j]==false && cost[min]+mat[min][j]<cost[j])
						{
							cost[j]=cost[v]+mat[min][j];
						}
							
					}
					visted[min]=true;
				}
			return cost;
			
				}

		void addedge(int a, int b,int w)
		{
			mat[a][b]=mat[b][a]=w;
			
		}
		void print()
		{
			for(int i=0;i<v;i++)
			{
				for(int j=0;j<v;j++)
				{
					System.out.print(" "+mat[i][j] );
				}
				System.out.println();
		}
		}


		private int findMin(int[] cost, boolean[] visted) {
			// TODO Auto-generated method stub
			int min=Integer.MAX_VALUE;
			int minIndex=0;
			for(int i=0;i<v;i++)
			{
				if(visted[i]==false && cost[i]<min)
				{
					min=cost[i];
					minIndex=i;
				}
			}
			return minIndex;
		}
}
