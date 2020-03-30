import java.util.*;
class control
{
public static void main(String args[])
{System.out.println("enter your age");
    Scanner sc=new Scanner(System.in);
   int age=sc.nextInt();
    if(age>18)
    {
        System.out.println("eligible to vote");
    }
    else {
        System.out.println("not eligible to vote");
    }
System.out.println("enter marks ");
int marks=sc.nextInt();
if(marks<40)
{
    System.out.println("FAIL");
}
else if(marks>=40&&marks<50)
{
    System.out.println("grade D");
}
else if(marks>=50&&marks<60)
{
    System.out.println("grade C");
}
else if(marks>=60&&marks<70)
{
    System.out.println("grade B");
}
else if(marks>=70&&marks<80)
{
    System.out.println("grade A");
}
else 
{
    System.out.println("grade O");
}
}

}