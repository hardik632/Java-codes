package dataStructures;
import java.util.*;
public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int[][] a=new int[r][c];
int[][] b=new int[r][c];
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}

int temp=0;
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
			temp=a[i][j];
			a[i][j]=b[i][j];
			b[i][j]=temp;
	}
}//b=Arrays.copyOf(a,a.length);
//Arrays.toString(b);for parsing
System.out.println();
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}

		
	}

}
