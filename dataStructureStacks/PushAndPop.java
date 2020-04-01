class PushAndPop{
    public static void main( String[] args)
    {
        Stacks obj = new Stacks();
        obj.push(1);
        obj.push(2);
        obj.push(4);
        obj.display();
        System.out.println();
        System.out.print( obj.pop());
    }
}
class Stacks
{
    int top;
    int arr[] = new int[1000];
    public Stacks()
    {
        top = -1;
    }
    public void push( int element )
    {
        arr[ ++top ] = element;
    }
    public int pop()
    {
        return arr[ top-- ];
    }
    public void display()
    {
        for(int i=0;i<top;i++)
        {
            System.out.print( arr[i]+" " );
        }
    }
}
