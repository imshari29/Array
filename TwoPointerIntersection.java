import java.util.ArrayList;
import java.util.Arrays;

public class TwoPointerIntersection {
    public static void main(String[] args) {
        int [] a = {1, 2, 1, 3, 1};
        int [] b = {3, 1, 3, 4, 1};

        int [] a1 = {1, 2, 3};
        int [] b1 = {4, 5, 6};

        ArrayList<Integer> ans = intersectionWithDuplicates(a,b);
        ArrayList<Integer> ans1 = intersectionWithDuplicates(a1,b1);

        System.out.println(ans);
        System.out.println(ans1);

    }
    public static ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length){
            if(a[i]<b[j]){
                i++;
            } else if (a[i] > b[j]) {
                j++;
            }else {
                if (result.size() == 0 || !result.get(result.size() - 1).equals(a[i])) {
                result.add(a[i]);
            }
                i++;
                j++;
            }
        }
        return result;
    }
}
