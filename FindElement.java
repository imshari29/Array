import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of an array :");
        int n = in.nextInt();
        if(n<=0){
            System.out.println("Invalid array size");
            return;
        }
        int [] a = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            a [i] = in.nextInt();
        }
        //key entry
        System.out.print("Enter the key(0-based index) :");
        int key = in.nextInt();
        //validate the key
        if(key >= 0 && key < n){
            System.out.println("OUTPUT : "+a[key]);
        }else {
            System.out.println("INVALID");
        }

    }
}
