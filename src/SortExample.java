public class SortExample {

    public static void main(String[] args) {

        int[] numbers = {40, 7, 59, 4, 1};

        displayValues(numbers);

    }//end main

    public static void selectionSort(int[] numbers){

        int indexMin = 0;

        for(int i = 0; i < numbers.length; i++){

            indexMin = i;

        }

    }//end of selection sort

    public static void displayValues(int[] numbers){

        for(int i = 0; i < numbers.length; i ++){

            System.out.println(numbers[i] + " ");

        }

        System.out.println("\n");


    }//end displayValues

}
