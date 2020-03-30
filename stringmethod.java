import java.util.*;
class stringmethod
{
void name(String fname,String lname)
{
    System.out.println("my name is : "+fname+" "+lname);
}
void fathername(String fname,String lname)
{
    System.out.println("my father name is : "+fname+" "+lname);
}
void mothername(String fname,String lname)
{
    System.out.println("my mother name is : "+fname+" "+lname);
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your firstname");
    String n=sc.next();
    System.out.println("enter your lastname");
    String n1=sc.next();
    System.out.println("enter your father firstname");
    String n2=sc.next();
    System.out.println("enter your father lastname");
    String n3=sc.next();
    System.out.println("enter your mother firstname");
    String n4=sc.next();
    System.out.println("enter yourmother lastname");
    String n5=sc.next();
    stringmethod obj=new stringmethod();
    obj.name(n,n1);
    obj.fathername(n2,n3);
    obj.mothername(n4,n5);
    
}
}