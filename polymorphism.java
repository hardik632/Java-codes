 
class calculator {

	int add(int x,int y)
	{
		return x+y;
	}
	int add(int x,int y,int z)
	{
		return x+y+z;
	}
}
public class polymorphism
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator obj=new calculator();
		System.out.println(obj.add(12, 13));
		System.out.println(obj.add(12,13,25));
	}

}
