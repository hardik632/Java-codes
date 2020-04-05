package dataStructures;
import java.util.Scanner;

public class SolutionA {
   
    public static int Search(int[] a) {
        int start = 1;
        int end = a.length;

        while (start <= end) {
        	
            int mid= (start+ end) / 2;// middle element

            if (mid == a[mid]) // element is found at middle
            {
                return mid;
            }
            if (mid < a[mid]) // element is less than middle
            {
                end = mid - 1;
            }
            else //element is greater than middle
            {	
                start = mid + 1;
            }
        }
        return -1; //no index found
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int index = Search(a);

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("NOT_FOUND");
        }
    }
}
