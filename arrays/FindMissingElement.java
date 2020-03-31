class FindMissingElement{
    public static void main( String[] args){
        int[] arr = { 1, 2, 3, 7, 8, 10};

        findMissingElement( arr );
    }
    public static void findMissingElement(int arr[])
    {
        int max = -99999;
        for(int i = 0; i<arr.length;i++)
        {
            if( arr[i] > max)
            {
                max = arr[i];
            }
        }
        int freqArraySize = max+1;
        int freqArray[] = new int[freqArraySize];
        
        for(int i=0;i<arr.length;i++)
        {
            freqArray[ arr[i] ]++;
        }

        for(int i = 0; i < freqArraySize; i++)
        {
            if( freqArray[i] == 0 )
            {
                System.out.print( i+" " );
            }
        }
    }
}