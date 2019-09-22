public class SortExample {

    public static void main(String[] args) {

        int[] numbers = {40, 7, 59, 4, 1};

        displayValues(numbers);
        //selectionSort(numbers);
        //displayValues(numbers);
        //sequentialSearch(numbers, 2);
        //sequentialSearch(numbers, 7);
        //bubbleSort(numbers); //reduces performance
        //displayValues(numbers);
        //binarySearch(numbers, 7); //returns value not found because the list is not sorted
        selectionSort(numbers);

        //Task 2
        /*if(binarySearch(numbers, 7)){

            System.out.println("Value found");

        }//end if

        else {

            System.out.println("Value not found");

        }//end else

         */

        //Task 3
        int found = binarySearchInt(numbers, 7);

         if(found !=-1){

            System.out.println("Value found at " + found);

        }//end if

        else {

            System.out.println("Value not found");

        }//end else





    }//end main

    //JP 3-4
    public static boolean binarySearch(int[] numbers, int value){

        int low = 0;
        int high = numbers.length -1; //-1 to exclude the lowest value

        while (high >= low){

            int middle = (low + high)/2; //Middle index

            if (numbers[middle] == value){

                /*System.out.println("The number " + value + " is at position "
                                   + middle + " in the list.");*/
                return true; //Target value found

            }//end if

            if (numbers[middle] < value){

                low = middle + 1;

            }//end if

            if(numbers[middle] > value){

                high = middle - 1;

            }//end if

        }//end of while

        //System.out.println("The number " + value + " is not in the list"); //value not found
        return false;

    }//end binary search

    public static int binarySearchInt(int[] numbers, int value){

        int low = 0;
        int high = numbers.length -1; //-1 to exclude the lowest value

        while (high >= low){

            int middle = (low + high)/2; //Middle index

            if (numbers[middle] == value){

                /*System.out.println("The number " + value + " is at position "
                                   + middle + " in the list.");*/
                return middle; //Target value found

            }//end if

            if (numbers[middle] < value){

                low = middle + 1;

            }//end if

            if(numbers[middle] > value){

                high = middle - 1;

            }//end if

        }//end of while

        //System.out.println("The number " + value + " is not in the list"); //value not found
        return -1;

    }//end binary search

   public static void sequentialSearch(int[] numbers, int value){

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] == value){

                System.out.println("The number " + value + " is at position "
                                   + i + " in the list");
                return;

            }//end if

        }//end for

       System.out.println("The number " + value + " is not in the list!");

   }//end sequentialSearch

    //JP 3-4
    public static void bubbleSort(int[] numbers) {

        for (int j = 0; j<numbers.length; j++ ){

            for (int i = 0; i< numbers.length - 1; i++){

                //Statement if numbers are not in order
                if (numbers[i] > numbers[i+1]){

                   //swaps the numbers
                   int temp = numbers[i];
                   numbers[i] = numbers[i+1];
                   numbers[i+1] = temp;

                }//end if

            }//end inner for loop

        }//end outer for loop

    }//end bubbleSort method

    //adding a boolean to check if sorting is done or not
    public static void bubbleSortModified(int[] numbers) {

        for (int j = 0; j<numbers.length; j++ ){

            boolean flag = false;

            for (int i = 0; i< numbers.length-j- 1; i++){

                //Statement if numbers are not in order
                if (numbers[i] > numbers[i+1]){

                    flag = true;
                    //swaps the numbers
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;

                }//end if

            }//end inner for loop

            //no swapping happened and the array is sorted
            if(!flag){ return; }//end if

        }//end outer for loop

    }//end bubbleSort method

    //JP 3-4
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
