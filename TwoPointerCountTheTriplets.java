import java.util.Arrays;

public class TwoPointerCountTheTriplets {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int res = getTriplet(a);
        System.out.println("The Output For Array A is : "+res);

        int [] b = {1,2,3,4,5,6};
        int ans = getTriplet(b);
        System.out.println("The Output For Array B is : "+ans);

        int [] c = {1,2,3,4,6,10,12,14,16,20,22,24,25,40,42,43};
        int sol = getTriplet(c);
        System.out.println("The Output For Array C is : "+sol);
    }
    public static int getTriplet(int[] a){
        Arrays.sort(a);
        int count = 0;
        for(int k = 2; k < a.length; k++) {
            int i = 0, j = k - 1;
            while (i < j) {
                int sum = (a[i]+a[j]);
                if(sum == a[k]){
                    count++;
                    i++;
                    j--;
                }else if(sum < a[k]){
                    i++;
                }else {
                    j--;
                }
            }
        }
        return count;
    }
}
