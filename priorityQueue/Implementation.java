import java.io.Console;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

class Implementation
{
    static int priority[] = {36,6,10,15,20};
    static int front[] = {-1,-1,-1,-1,-1};
    static int rear[] = {-1, -1,-1,-1,-1};
    static int queue[][] = new int[priority.length][priority.length];

    public static int findIndex( int p )
    {
        int index = 0;
        for(int i=0;i<priority.length;i++)
        {
            if( priority[i] == p)
            {
                index = i;
            }
        }
        return index;
    }
    public static void sortPriority()
    {
        for(int i=0;i<priority.length;i++)
        {
            for(int j=i+1;j<priority.length;j++)
            {
                if( priority[i]>priority[j]){
                int temp = priority[i];
                priority[i] = priority[j];
                priority[j] = temp;}
            }
        }
    }
    public static void insertValue(int data, int p)
    {
        int index = findIndex(p);  
        if(front[index] == -1 || rear[index] == -1){
            front[index] = 0;
            rear[index] = 0;
            queue[index][0] = data;
        }else if(rear[index] < queue.length){
            rear[index] ++;
            queue[index][rear[index]] = data;
        }
        // else if( rear[index] > queue.length )
        // {
        //     front[index+1]++;
        //     rear[index+1]++;
        //     queue[index+1][rear[index+1]] = data;
        // }
    }
    public static void deleteValue( int p)
    {
        int index = findIndex(p);
        if(front[index] == -1 || rear[index] == -1)
        {
            System.out.println("Overflow");
        }else{
            front[index]++;
        }
    }
    public static void display()
    {
        for(int i=0;i<queue.length;i++)
        {
            for(int j=front[i];j<=rear[i];j++)
            {
                if( front[i] == -1 || rear[i] == -1)
                {
                    front[i] = 0;
                    rear[i] = rear.length-1;
                }
            }
        }
        for(int i=0;i<queue.length;i++)
        {
            for(int j=front[i];j<=rear[i];j++)
            {
                System.out.print( queue[i][j] +"  ");
            }System.out.println();
        }
    }
    public static void main( String [] args)
    {
        Implementation obj = new Implementation();
        sortPriority();
        obj.insertValue(50, 36);
        obj.insertValue(100, 36);
        obj.insertValue(78, 10);
        obj.insertValue(120, 36);
        obj.insertValue(85, 6);
        obj.insertValue(55, 6);
        obj.insertValue(60, 6);
        obj.insertValue(75, 6);
        obj.insertValue(35, 6);
        // obj.insertValue(10, 6);
        obj.insertValue(65, 20);
        deleteValue(36);
        deleteValue(6);
        obj.display();
    }
}