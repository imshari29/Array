import java.util.Arrays;

public class MissingElementBinSearch {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        System.out.println(findElement(arr1)); // Output: 4

        int[] arr2 = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(findElement(arr2)); // Output: 6

        int[] arr3 = {1};
        System.out.println(findElement(arr3)); // Output: 2
    }

    public static int findElement(int [] arr) {
        Arrays.sort(arr);
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == mid + 1){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low + 1;
    }
}

/*
    while(low<=high){
        int mid = (low + high)/2;
        if (arr[mid] != mid + 1){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
    }
    # The missing number is `left + 1`
    return left + 1*/
