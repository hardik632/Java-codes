import java .util.*;
class marks
{
    void check(int marks)
    {
        if(marks>40)
        {
            System.out.println("Congratulation! you are pass with ");
            if(marks>=40&&marks<50)
            {
                System.out.println("grade D");
            }
            if(marks>=50&&marks<60)
            {
                System.out.println("grade C");
            }
            if(marks>=60&&marks<70)
            {
                System.out.println("grade B");
            }
            if(marks>=70&&marks<80)
            {
                System.out.println("grade A");
            }
            else
            {
                System.out.println("grade O");
            }
        }
        else
        {
            System.out.println("you are Fail");
        }
    }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER YOUR MARKS");
            int n=sc.nextInt();
            marks m=new marks();
            m.check(n);

        }
    
}