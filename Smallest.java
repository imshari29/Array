import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = in.nextInt();
        //initialize the array
        int [] arr = new int[n];
        //get value of each arr element
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        //smallest
        int smallest = arr[0 ];
        for (int i = 0; i < n; i++) {
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("The smallest among array is : "+smallest);
    }
}
