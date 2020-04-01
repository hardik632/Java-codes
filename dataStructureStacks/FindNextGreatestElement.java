import java.util.Stack;
class FindNextGreatestElement
{
    public static void main( String[] args){
        int arr[] = {39, 12, 14, 56, 74, 95, 32, 17};

        findNextGreaterElement(arr);
    }
    public static void findNextGreaterElement( int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int arr2[] = new int[arr.length];  
        int len = arr.length-1;
        int k = len;
        stack.push(arr[len]);     
        for(int i=arr.length-1;i>=0;i--){
            if( stack.peek() < arr[i])
            {
                while( ! stack.isEmpty())
                {
                    stack.pop();
                }
                stack.push(arr[i]);
                arr2[k] = -1;k--;
            }else if( stack.peek() > arr[i] )
            {
                arr2[k] = stack.peek();
                k--;
                stack.push(arr[i]);
            }
        }
        for(int i=0;i<k;i++)
        {System.out.print(arr2[i]+" ");}
    }
}