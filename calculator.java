import java.util.*;
class calculator
{
    void calculate(String a,int b,int c)
    {
        switch(a)
        {
            case "+":
            System.out.println("sum is : "+(b+c));
            break;
            case "-":
            System.out.println("difference is :"+(b-c));
            break;
            case "*":
            System.out.println("multiplication is :"+(b*c));
            break;
            case "/":
            if(c==0)
            {
                System.out.println("division is not possible");
            }
            else
            System.out.println("divison is :"+(b/c));
            break;
            default:
            System.out.println("please enter valid number");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        calculator obj=new calculator();
        System.out.println("enter two numbers");

        int n=sc.nextInt();
        int m=sc.nextInt();
      System.out.println("enter + for addition ,enter - for difference, enter * for multiplication, enter / for division");
        String l=sc.next();
        obj.calculate(l,n,m);
    }
}