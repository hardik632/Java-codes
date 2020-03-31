class RemoveDuplicates{
    public static void main( String[] args )
    {
        int arr[] = {5, 8, 7, 10, 2, 8, 3, 4, 7, 5, 11, 20};

        int max = findMaxElement( arr );
        removeDuplicates( arr, max );

        // for(int i=0;i<result.length;i++)
        // System.out.print( result[i]+" ");
    }
    public static int findMaxElement( int[] arr)
    {
        int max = arr[0];
        for(int i=0; i< arr.length;i++)
        {
            if(arr[i] > max)
            max = arr[i];
        }
        return max;
    }
    public static void removeDuplicates( int arr[], int max )
    {
        int freqArraySize = max+1;
        int freqArray[] = new int[freqArraySize];
        for(int i=0;i<arr.length;i++)
        {
            freqArray[ arr[i] ]++;
        }
        int count = 0;
        for(int i=0;i<freqArraySize;i++)
        {
            if( freqArray[i] != 0 )
            count++;
        }

        int resultArray[] = new int[ count ];
        int k = 0;

        for(int i=0;i<freqArraySize;i++)
        {
            if( freqArray[i] != 0 )
            {
                resultArray[k] = i; 
                k++;
            } 
        }
        for(int i=0; i< k;i++)
        System.out.print( resultArray[i]+"  "); 
    }
}



// from website

// public static int[] removeDuplicates(int[] numbersWithDuplicates) {

//     // Sorting array to bring duplicates together      
//     Arrays.sort(numbersWithDuplicates);     
  
//     int[] result = new int[numbersWithDuplicates.length];
//     int previous = numbersWithDuplicates[0];
//     result[0] = previous;

//     for (int i = 1; i < numbersWithDuplicates.length; i++) {
//         int ch = numbersWithDuplicates[i];

//         if (previous != ch) {
//             result[i] = ch;
//         }
//         previous = ch;
//     }
//     return result;

// }