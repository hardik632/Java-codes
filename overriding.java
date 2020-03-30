class test
{
	void car()
	{
		System.out.println("my car is running at good speed");
	}
}
class example extends test
{
	void car()
	{
	System.out.println("my car is not running at good speed");
}
}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test ob=new example();
		ob.car();

	}

}
