
public class RatInMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze=new int[][] {{ 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 0, 0 },{ 1, 1, 1, 1 }};
		RatInMaze ratInMaze =new RatInMaze();
		ratInMaze.solveMaze(maze,maze.length);

	}

	private boolean solveMaze(int[][] maze, int n) {
		
		int[][] path=new int[n][n];
		if(pathInMaze(maze,0,0,path,n)==false)
		{
			System.out.println("path not found");
			return false;
		}
		System.out.println("path found");
		printPath(path,path.length);
		return true;
	}

	private boolean pathInMaze(int[][] maze, int i, int j, int[][] path, int n) {
		
		if(i==n-1 && j==n-1)
		{
			path[i][j]=1;
			return true;
		}
		if(isSafe(maze,i,j)==true) {
			path[i][j]=1;
			
			if(pathInMaze(maze,i+1,j,path,n)==true)
			{
				//path[i][j]=1;
				return true;
			}
			if(pathInMaze(maze,i,j+1,path,n)==true)
			{
				//path[i][j]=1;
				return true;
			}
		path[i][j]=0;
		return false;
		}
		return false;
		
	}

	private boolean isSafe(int[][] maze, int i, int j) {
		
		return (i>=0 && i<maze.length && j>=0 && j<maze.length && maze[i][j]==1);
		
	}

	private void printPath(int[][] path, int n) {
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(path[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
