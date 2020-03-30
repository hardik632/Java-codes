class account
{
private long acc_no;
private String name,email;
private double amount;
public long get_accno()
{
	return acc_no;
}
public void set_accno(long acc_no)
{
	this.acc_no=acc_no;
}
public String get_name()
{
	return name;
}
public void set_name(String name)

{
	this.name=name;
	}
public String get_email()
{
	return email;
}
public void set_email(String email)
{
	this.email=email;
}
public double get_amount()
{
	return amount;
}
public void set_amount(double amount)
{
	this.amount=amount;
}
}
public class encapsulation {
	public static void main(String args[])
	{
		account obj=new account();
		obj.set_accno(12345);
		obj.set_name("hardik");
		obj.set_email("hardik@gmail.com");
		obj.set_amount(1200.19);
		System.out.println("account no: "+obj.get_accno()+" name is: "+obj.get_name()+" email is: "+obj.get_email()+" amount is: "+obj.get_amount());
	}
	

}
