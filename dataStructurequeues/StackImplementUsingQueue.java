import java.util.LinkedList;
import java.util.Queue;

class StackImplementUsingQueue{
    static int front = -1;
    static int rear = -1;
    static Queue<Integer> queue = new LinkedList<Integer>();
    public static void insert( int data )
    {
                queue.add(data);
                int size = queue.size();
                for(int i=0;i<size-1;i++)
                {
                    queue.add(queue.poll());
                }
    }
    public void display()
    {
        System.out.println(queue);
        while( !queue.isEmpty())
        {
            System.out.print( queue.peek()+" ");
            queue.poll();
        }
    }
    public static void main( String[] args){
        StackImplementUsingQueue obj = new StackImplementUsingQueue();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.display();

    }
}