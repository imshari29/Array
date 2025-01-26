import java.util.Arrays;

public class TwoPointerFindPairDiff {
    public static void main(String[] args) {
        TwoPointerFindPairDiff sol = new TwoPointerFindPairDiff();
        int [] a = {5, 20, 3, 2, 5, 80};
        int target = 78;

        int [] b = {90, 70, 20, 80, 50};
        int target1 = 45;

        int [] c = {1};
        int target2 = 1;

        boolean ans = sol.findPair(a,target);
        boolean ans1 = sol.findPair(b,target1);
        boolean ans2 = sol.findPair(c,target2);


        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    public boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        int i = 0, j = 1;
        while(i < arr.length && j < arr.length){
            if(arr[j]-arr[i]==x && i!=j){
                return true;
            }else if(arr[j]-arr[i]<x){
                j++;
            }else{
                i++;
            }
        }
        return false;
    }
}
