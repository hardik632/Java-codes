import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		if(i%2==0)
		{
			System.out.println(i+" is even number");
		}
		else
		{
			System.out.println(i +" is odd number");
		}

	}

}
