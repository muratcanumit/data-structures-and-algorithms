public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers =  { 3, 2, 1, 5, 4 , 0};
        int size = numbers.length;
        int temp = 0;

        System.out.print("\nMinimum approach");
        selectionSort(numbers, size, temp);

        System.out.print("\nThe Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }


        System.out.println("--------------------");

        System.out.print("\nMaximum Approach");
        selectionSortMax(numbers, size, temp);

        System.out.print("\nThe Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    private static void selectionSort(int[] numbers, int size, int temp) {

        // minimum approach
        for (int i = 0; i < size - 1; i++) {

            int minimumIndex = i;
            for (int j = i + 1; j < size; j++) {

                if (numbers[minimumIndex] > numbers[j]) {
                    minimumIndex = j;
                }

            }

            temp = numbers[i];
            numbers[i] = numbers[minimumIndex];
            numbers[minimumIndex] = temp;

            System.out.println();
            for(int number : numbers) {
                System.out.print(number + " ");
            }
        }

    }

    private static void selectionSortMax(int[] numbers, int size, int temp) {

        // Maximum approach
        for (int i = size - 1; i > 0; i--) {

            int maximumIndex = i;
            for (int j = 0; j < i; j++) {

                if (numbers[j] > numbers[maximumIndex]) {
                    maximumIndex = j;
                }

            }

            temp = numbers[i];
            numbers[i] = numbers[maximumIndex];
            numbers[maximumIndex] = temp;

            System.out.println();
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }

}