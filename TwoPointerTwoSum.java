import java.util.Arrays;

public class TwoPointerTwoSum {
    public static void main(String[] args) {
        TwoPointerTwoSum sol = new TwoPointerTwoSum();
        int [] a = {5, 20, 3, 2, 5, 70};
        int x = 78;

        int [] b = {90, 70, 20, 80, 50};
        int x1 = 90;

        boolean ans = sol.twoSum(a,x);
        boolean ans1 = sol.twoSum(b,x1);

        System.out.println(ans);
        System.out.println(ans1);
    }

    boolean twoSum(int [] a, int target) {
        // code here
        Arrays.sort(a);
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] + a[j] < target) {
                i++;
            } else if (a[i] + a[j] > target) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
