import java.util.*;
public class constructor
{
    int n,m;
    String x,y;
    constructor(String name,int id, int batch,String subject)
    {
       x=name;
       y=subject;
       n=id;
       m=batch;
       System.out.println("name is: "+x+" id is: "+n+" batch is: "+m+" subject is: "+y);
       
    }

    public static void main(String args[])
    {
       
        constructor obj1=new constructor("hardik",1103,2017,"cse");
        constructor obj2=new constructor("divij",1081,2017,"cse");
        constructor obj3=new constructor("hardik",1105,2017,"cse");
        constructor obj4=new constructor("harkirat",1108,2017,"cse");


    }
}