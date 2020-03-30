import java.util.Scanner;

public class SolutionB {
    /**
     * This function implements binary search on the userIDs and attempts to find
     * an index where userIDs[index] == searchValue
     *
     * @param userIDs An array of ints representing the user ids, where the ints are sorted from the smallest to the
     *                largest
     * @param start   an int indicating the start index that we want to search from
     * @param end     an int indicating the end index that we want to stop searching at
     * @return the index where userIDs[index] == searchValue or -1 if no such index exists
     */
    private static int bookBinarySearch(int[] userIDs, int start, int end, int searchValue) {
        int mid = (start + end) / 2;

        try {
            if (end <= start) {
                return -1;
            } 
            else if (userIDs[mid] == searchValue) {
                
                return mid;
            } else if (userIDs[mid] > searchValue) {
               
                return bookBinarySearch(userIDs, start, mid - 1, searchValue);
            } else {
             
                return bookBinarySearch(userIDs, mid + 1, end * end, searchValue);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            return bookBinarySearch(userIDs, start, mid, searchValue);
        }

    }

    /**
     * A driver function that calls the bookBinarySearch function
     *
     * @param userIDs     An array of ints representing the user ids, where the ints are sorted from the smallest to the
     *                    largest
     * @param searchValue an value that we are searching for, where userIDs[index] == searchValue
     */
    public static int search(int[] userIDs, int searchValue) {
        return bookBinarySearch(userIDs, 1, 2, searchValue);
    }

    /**
     * The entry point to the program
     *
     * @param args arguments that you want to pass into the program
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int M = scanner.nextInt();

        // testing the edge case that there are no user ids
        if (size == 0) {
            System.out.print("NOT_FOUND");
            return;
        }

        // initializing the user IDs
        int userIDs[] = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            userIDs[i] = scanner.nextInt();
        }

        int index = search(userIDs, M);

        // printing out the index if we find searchValue in the user ids array
        // otherwise print out "NOT FOUND"
        System.out.println(index == -1 ? "NOT FOUND" : index);

    }
}
