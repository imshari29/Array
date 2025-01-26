public class FloorCeil {
    // Function to find the floor value
    public static int findFloor(int[] arr, int x) {
        int floor = -1;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                floor = arr[mid]; // Update floor
                low = mid + 1;    // Search in the right half
            } else {
                high = mid - 1;   // Search in the left half
            }
        }

        return floor;
    }

    // Function to find the ceil value
    public static int findCeil(int[] arr, int x) {
        int ceil = -1;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ceil = arr[mid]; // Update ceil
                high = mid - 1;  // Search in the left half
            } else {
                low = mid + 1;   // Search in the right half
            }
        }

        return ceil;
    }

    // Main function to find both floor and ceil
    public static int[] getFloorAndCeil(int[] arr, int x) {
        int floor = findFloor(arr, x); // Call floor function
        int ceil = findCeil(arr, x);   // Call ceil function

        return new int[]{floor, ceil}; // Return as an array
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 8, 10, 12};
        int x = 5;

        int[] result = getFloorAndCeil(arr, x);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
    }

}