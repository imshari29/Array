import java.util.ArrayList;
public class FirstAndLastOccurancesOfXS2 {
    public static ArrayList<Integer> find(int[] arr, int x) {
        ArrayList<Integer> res = new ArrayList<>();

        // Find the first occurrence
        int first = bSearch(arr, x, true);

        // Find the last occurrence
        int last = bSearch(arr, x, false);

        // Add results to the list
        res.add(first);
        res.add(last);

        return res;
    }
    public static int bSearch(int[] arr, int x, boolean isFirst) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                result = mid;
                if (isFirst) {
                    high = mid - 1;  // Move left for the first occurrence
                } else {
                    low = mid + 1;   // Move right for the last occurrence
                }
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
    public static void main(String[] args) {

        // Test input array and element to search
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;

        // Call find method to get the first and last occurrence
        ArrayList<Integer> result = find(arr, x);

        // Print the result
        System.out.println("First occurrence of " + x + " is at index: " + result.get(0));
        System.out.println("Last occurrence of " + x + " is at index: " + result.get(1));
    }
}
