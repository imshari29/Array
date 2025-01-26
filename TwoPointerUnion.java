import java.util.ArrayList;

public class TwoPointerUnion {
    public static void main(String[] args) {
        int [] a = {2, 2, 3, 4, 5};
        int [] b = {1, 1, 2, 3, 4};
        ArrayList<Integer> result = findUnion(a,b);
        System.out.println(result);
    }
    public static ArrayList<Integer> findUnion(int [] a, int [] b){
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            if(a[i]<b[j]){
                if(res.size()==0 || !res.get(res.size() - 1).equals(a[i])) {
                    res.add(a[i]);
                }
                i++;
            } else if(a[i]>b[j]){
                if(res.size()==0 || !res.get(res.size() - 1).equals(b[j])) {
                    res.add(b[j]);
                }
                j++;
            } else {
                if(res.size()==0 || !res.get(res.size() - 1).equals(a[i])) {
                    res.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while (i < a.length){
            if (res.size() == 0 || !res.get(res.size() - 1).equals(a[i])) {
                res.add(a[i]);
            }
            i++;
        }
        while (j < b.length){
            if (res.size() == 0 || !res.get(res.size() - 1).equals(b[j])) {
                res.add(b[j]);
            }
            j++;
        }
        return res;
    }
}
