import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[100];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<100;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<100;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
