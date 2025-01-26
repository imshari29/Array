public class ElementAppearOnlyOnce {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4,5,6,6,7,7,8,8,9,9};
        int ans = findAns(arr);
        System.out.println(ans);
    }
    public static int findAns(int[] arr){
        int low = 0, high = arr.length-2;
        while (low <= high){
            int mid = (low+high)/2;
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                   low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }else{
              if(arr[mid]==arr[mid-1]){
                  low = mid + 1;
              }else{
                  high = mid - 1;
              }
            }
        }
        return arr[low];
    }
}
