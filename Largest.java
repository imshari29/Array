import java.util.Scanner;

class Largest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take the size of array
        System.out.print("Enter the size of array :");
        int n = in.nextInt();
        //initialize array
        int [] arr = new int[n];
        // Input the elements of the array
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        // find the largest
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        //output last element
        System.out.println("Thr largest among the array is "+largest);
    }
}