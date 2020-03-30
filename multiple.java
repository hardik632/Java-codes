//interface
//due to ambiguity problem java class does not support multiple inheritance and hybrid inheritance
//class vs interface
//interface vs abstract
import java.util.*;
interface multiple_inheritance
{
	
	void display(int n);
}
public class multiple implements multiple_inheritance {

	public void display(int n)
	{
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiple obj=new multiple();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		obj.display(n);

	}

}
