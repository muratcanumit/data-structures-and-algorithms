public class BinarySearch {

    // will work on terminal
    public static void main(String[] args) {

        // A sorted array
        int numbers [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        // the target element you are looking for...
        int target = 15;

        // Binary Search v1
        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }

        // Binary Search v2 call
        int left = 0;
        int right = numbers.length - 1;
        int target2 = 18;
        int result2 = binarySearchv2(numbers, target2, left, right);

        if (result2 != -1) {
            System.out.println("Target found at index: " + result2);
        } else {
            System.out.println("Target not found");
        }
    }

    private static int binarySearch(int[] numbers, int target) {

        // your starting index
        int left = 0;
        // your ending index
        int right = numbers.length - 1;

        while (left <= right) {

            // find the middle index of the array
            int mid = left + (right - left) / 2;

            // check the target if it is matching with the middle else find it on the which side
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                // if your middle index is behind the target shift starting index by 1
                left = mid + 1;
            } else {
                // if your middle index is beyond the target shift ending index by -1
                right = mid - 1;
            }
        }

        return -1;
    }

    // this is the second way for the binary search
    private static int binarySearchv2(int[] numbers, int target, int left, int right) {

        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                // recursive approach instead of iterating a loop
                return binarySearchv2(numbers, target, mid + 1, right);
            } else {
                // recursive approach instead of iterating a loop
                return binarySearchv2(numbers, target, left, mid - 1);
            }
        }

        return -1;
    }


}