public class LinearSearch {

    // will work on terminal
    public static void main(String[] args) {

        // A sorted array
        int numbers [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

        // the target element you are looking for...
        int target = 12;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }

    }

    private static int linearSearch(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                // return the index of the target value
                return i;
            }
        }
        // if target value is not in the array, then return -1 simply.
        return -1;
    }
}