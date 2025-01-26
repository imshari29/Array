public class BitonicPoint {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 4, 2, 1, 0};
        int[] arr2 = {60, 40, 30 , 10, 0};
        int[] arr3 = {10, 20, 30, 40, 50};

        int res = bitonic(arr);
        int res2 = bitonic(arr2);
        int res3 = bitonic(arr3);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
    public static int bitonic(int[]arr){
        int low = 0, high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            //Check if mid is the bi-tonic point
            if((mid==0 || arr[mid] > arr[mid-1]) && (mid == arr.length -1 || arr[mid]>arr[mid+1])){
                return arr[mid];
            } // If mid is part of the increasing sequence so element should be in rightPart
            else if (mid>0 && arr[mid]>arr[mid-1]) {
                low = mid + 1;
            } // If mid is part of the decreasing sequence so element should be in leftPart
            else { /*if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {*/
                high = mid - 1;
            }
        }
        //edge case if no element is present
        return -1;
    }
}
