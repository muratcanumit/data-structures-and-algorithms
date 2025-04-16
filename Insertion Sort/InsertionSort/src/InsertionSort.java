public class InsertionSort {
    public static void main(String[] args) {

        int[] numbers = { 5, 10, 9, 8, 7, 1 };
        int size = numbers.length;

        insertionSort(numbers, size);

        System.out.print("The Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void insertionSort(int[] numbers, int size) {

        for(int i = 1; i < size; i++) {
            int temp = numbers[i];
            int j = i - 1;

            while(j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = temp;

            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }

}