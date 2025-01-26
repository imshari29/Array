import java.util.ArrayList;

public class  FirstAndLastOccurancesOfX{

    // Main method
    public static void main(String[] args) {


        // Test input array and element to search
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;

        // Find the first and last occurrences
        ArrayList<Integer> result = binarySearch(arr, x);

        // Print the result
        System.out.println("First occurrence of " + x + " is at index: " + result.get(0));
        System.out.println("Last occurrence of " + x + " is at index: " + result.get(1));
    }

    // Binary search to find both first and last occurrences
    private static ArrayList<Integer> binarySearch(int[] arr, int x) {
        ArrayList<Integer> res = new ArrayList<>();
        int low = 0, high = arr.length - 1;
        int first = -1, last = -1;

        // Binary search for the first occurrence
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                first = mid;  // Found first occurrence
                high = mid - 1;  // Search left part
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Binary search for the last occurrence
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                last = mid;  // Found last occurrence
                low = mid + 1;  // Search right part
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Add results to the list and return
        res.add(first);
        res.add(last);
        return res;
    }
}
