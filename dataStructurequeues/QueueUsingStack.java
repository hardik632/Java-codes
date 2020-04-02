import java.util.*;
class QueueUsingStack{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    
    public static void insert( int data )
    {
            while( !s1.isEmpty() )
            {
                s2.push(s1.pop());
            } 
            s1.push(data);
            while( !s2.isEmpty() )
            {
                s1.push( s2.pop() );
            }   
    }
public void display()
{
    while( !s1.isEmpty())
    {
        System.out.print(s1.pop() + " ");
    }
}
    public static void main(String[] args){

        QueueUsingStack queue = new QueueUsingStack();
        queue.insert(2);
        queue.insert(4);
        queue.insert(3);
        queue.display();
    }
}