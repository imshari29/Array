import java.util.ArrayList;
import java.util.Arrays;

public class TwoPointerTwoPairSumWithZeroSum {
    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> result1 = getPairs(arr1);
        System.out.println("Test Case 1 Output: " + result1);

        // Test case 2
        int[] arr2 = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        ArrayList<ArrayList<Integer>> result2 = getPairs(arr2);
        System.out.println("Test Case 2 Output: " + result2);

        // Test case 3
        int[] arr3 = {3, -3, 3, -3, 2, -2, 1, -1};
        ArrayList<ArrayList<Integer>> result3 = getPairs(arr3);
        System.out.println("Test Case 3 Output: " + result3);

        // Test case 4
        int[] arr4 = {0, 0, 0, 0};
        ArrayList<ArrayList<Integer>> result4 = getPairs(arr4);
        System.out.println("Test Case 4 Output: " + result4);

        // Test case 5
        int[] arr5 = {10, -10, 5, -5, 2, -2};
        ArrayList<ArrayList<Integer>> result5 = getPairs(arr5);
        System.out.println("Test Case 5 Output: " + result5);

    }
    public static ArrayList<ArrayList<Integer>> getPairs (int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int i = 0, j = arr.length-1;
        while (i < j){
            if(arr[i]+arr[j]==0){
                if(res.isEmpty() || !res.get(res.size()-1).get(0).equals(arr[i])){
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    res.add(pair);
                }
                    i++;
                    j--;
            } else if ((arr[i] + arr[j]) > 0) {
                    j--;
            }else {
                    i++;
            }
        }
        return res;
    }
}
