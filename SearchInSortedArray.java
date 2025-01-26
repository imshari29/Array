public class SearchInSortedArray {
    public static void main(String[] args) {
        int [] a = {8,9,10,11,12,13,1,2,3};
        int key = 3;
        int [] a1 = {3,4,5,6};
        int key1 = 7;
        int [] a2 = {33, 42, 72, 99};
        int key2 = 42;
        int ans  = searchSorted(a, key);
        int ans1 = searchSorted(a1,key1);
        int ans2 = searchSorted(a2,key2);



        System.out.println("The Key Is Found In Array Index(0-based index) : "+ans);
        System.out.println("The Key Is Found In Array Index(0-based index) : "+ans1);
        System.out.println("The Key Is Found In Array Index(0-based index) : "+ans2);
    }
    public static int searchSorted(int [] arr, int key){
        int low = 0, high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            if (arr[low] <= arr[mid]){
                if(key >= arr[low] && key < arr[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(key  > arr[mid] && key <= arr[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
