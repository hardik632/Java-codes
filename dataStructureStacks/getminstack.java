package dataStructureStacks;

public class getminstack {
	
	
	int[] arr;
	int top;
	getminstack()
	{
		arr=new int[100];
		top=-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getminstack obj=new getminstack();
		obj.push(3);
		obj.push(4);
		obj.push(1);
		obj.display();
		System.out.println("min is:"+obj.getmin());
		System.out.println("pop:"+obj.pop());
		System.out.println("min is:"+obj.getmin());
		System.out.println("pop:"+obj.pop());
		System.out.println("min is:"+obj.getmin());
		

	}
	void push(int n)
	{
		if(top==arr.length)
		{
			System.out.println("overflow");
		}
		top++;
		arr[top]=n;
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("underflow");
		}
		int temp=arr[top];
		top--;
		return temp;
	}
	
	int getmin()
	{
		int min=100;
		for(int i=0;i<=top;i++)
		{
			if(arr[i]<min)
				{
					min=arr[i];
				}
			
		}
		return min;
	}
	void display()
	{
		System.out.print("queue is: ");
		if(top==-1)
		{
			System.out.println("empty stack");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}

	}

}
