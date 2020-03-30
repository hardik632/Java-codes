import java.util.*;
class variable{
int amount=100;
static int pin=2315;
public static void showlocal()
{
    int agea=35;
    System.out.println("static local "+agea);
}    
public void demolocal()
{
    int ageb=30;
    System.out.println("local variable "+ ageb);
}
public void demoinstance()
{
    int interst=30;
    int total=amount*interst;
    System.out.println("total "+total);
}
public static void main(String args[])
{
    //new keyword gives memory
    variable v=new variable();
    showlocal();
    v.demolocal();
    v.demoinstance();   
}
}