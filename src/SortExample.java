public class SortExample {

    public static void main(String[] args) {

        int[] numbers = {40, 7, 59, 4, 1};

        displayValues(numbers);
        selectionSort(numbers);
        displayValues(numbers);

    }//end main

    public static void selectionSort(int[] numbers){

        int indexMin = 0;

        for(int i = 0; i < numbers.length; i++){

            indexMin = i;

            for(int j = i + 1; j < numbers.length; j++){

                if(numbers[j] < numbers[indexMin]){

                    indexMin = j;

                }//end of if

            }//end of inner for loop

            //
            int temp = numbers[i]; //temp stores the minimum index value
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;

        }//end of outer for loop

    }//end of selection sort

    public static void displayValues(int[] numbers){

        for(int i = 0; i < numbers.length; i ++){

            System.out.println(numbers[i] + " ");

        }

        System.out.println("\n");


    }//end displayValues

}
