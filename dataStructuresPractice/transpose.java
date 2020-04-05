package dataStructures;
import java.util.*;
public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int[][] a=new int[r][c];
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
System.out.println("after transposing");
int temp=0;
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		if(i<=j)
		{
			temp=a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
		}
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
	}

}
