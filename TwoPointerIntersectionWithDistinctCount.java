import java.util.Arrays;

public class TwoPointerIntersectionWithDistinctCount {
    public static void main(String[] args) {
        int [] a = {1, 2, 4, 3, 5, 6};
        int [] b = {3, 4, 5, 6, 7};

        int res = numberofElementsInIntersection(a,b);

        System.out.println(res);
    }

    public static int numberofElementsInIntersection(int[] a, int[] b) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            if(a[i]<b[j]){
                i++;
            }else if(a[i]>b[j]){
                j++;
            }else{
                count = count + 1;
                i++;
                j++;
            }
        }
        return count;
    }
}

