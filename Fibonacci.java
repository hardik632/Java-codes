import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int []d=new int[n+1];
		int a=0;
		int b=1;
		int c=0;
		d[0]=0;
		d[1]=1;
		for(int i=2;i<d.length;++i)
		{
			c=a+b;
			d[i]=c;
			a=b;
			b=c;
		}
		int flag=0;
		for(int i=0;i<d.length;i++)
		{
			if(d[i]==n) {
				flag=1;
				break;}
			
		}
		if(flag==1)
		System.out.print("isFibo");
		

	}

}
