public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {5,9,3,7,4,2,32,17,22};
        int sizeOfNumbers = numbers.length;
        // the temp value to use while switching number indexes
        int temp = 0;

        bubbleSort(numbers, sizeOfNumbers, temp);

        System.out.print("\nThe sorted array: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }


    }

    private static void bubbleSort(int[] numbers, int sizeOfNumbers, int temp) {

        for(int i = 0; i < sizeOfNumbers; i++) {

            for(int j = 0; j < sizeOfNumbers-i-1; j++) {

                if(numbers[j] > numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
                System.out.println();
                for(int number : numbers) {
                    System.out.print(number + " ");
                }

            }

        }
    }

}