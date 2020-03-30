import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int n=sc.nextInt();
		int temp=n;
		int last=0;
		int no=0;
		while(temp>0)
		{
			last=temp%10;
			no=no+(int)Math.pow(last,3);
			temp=temp/10;
		}
		if(no==n)
			System.out.println("number is armstrong");
		else
			System.out.println("number is armstrong");

			

	}

}
