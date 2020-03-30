import java .util.*;
class loop
{
    public static void main(String args[])
    {
        for(int i=0;i<10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("outside the loop");
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
               continue;
            }
            System.out.println(i);
        }
        System.out.println("odd numbers");
        System.out.println("");
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
               continue;
            }
            System.out.println(i);
        }
        System.out.println("even numbers");
       /* System.out.println("increment");
        for(int i=1;i<=100;i++)
        {
            System.out.print(i+" ");
        }
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("decrement ");

        for(int i=100;i>=1;i--)
        {
            System.out.print(i+" ");
        }
System.out.println("enter the number to get table");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("enter the number upto which you want the table");
int m=sc.nextInt();
        for(int i=1;i<=m;i++)
        {
            System.out.println(n +" * "+ i + " = " + (n*i));
        }
    */
    /*
int i=1;
while(i<=n)
{
     System.out.println(n +" * "+ i + " = " + (n*i));
     i++;
}*/
/*
int i=1;
do
{
    System.out.println(i);
    i++;
}
while(i<=10);*/
    }}