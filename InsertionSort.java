// Insertion Sort Algorithm - Coding with John

// "import java.util.random" means importing a package to perform your task easier.
//Insertion Sort - Walks through the array and places the values where they need to go.
//It compares the current value with the previous values and shifts the values right if the previous value is larger than the current value.

//Below is the Insertion Sorting Algorithm
//Creating a row of 10 random integers between 0 and 99, which gives a randomized array to sort

//Want to walk through our unsorted array from beginning to end inserting the values where they need to go




import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        //Creates random integers between 0 and 99
        Random rand = new Random();
        //array of 10 random amont integers
        int[] numbers = new int[10];
        //Gives us a randomized array to sort
        for (int i=0; i<numbers.length; i++ ) {
            //rand.nextInt(100); Controls what the number goes up too.
            numbers[i] = rand.nextInt(10) ;
        }
        //print out the unsorted array
        System.out.println("Before:");
        printArray(numbers);

        //call insertion method which contains the algorithm to write
        insertionSort(numbers);

        //print out the sorted array
        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i =0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    //Insertion Sort Algorithm

    //In this method the array to be sorted is sent in as the inputArray parameter
    private static void insertionSort(int[] inputArray) {
        //Start with for() loop in order to walk through the array.
        // Start for loop at 1 since 0 compares to itself and won't move anywhere else in the array.
        for(int i = 1; i < inputArray.length; i++) {
        // For each value we look at, we take that current value and copy it off to a temporary variable.
        int currentValue = inputArray[i];

        //Going to use int j to walk back to the beginning of the array. To have j reference the number next to it, set j to i-1
        int j = i-1;
        //Now we can start the while loop. Going to make us stop walking back once we hit the beginning of the array.
        //Other part of the condition is that we are going to look at the value of the condition spot in the array at j 
        //and keep going when the value is greater than the current value at i
        while (j >=0 && inputArray[j] > currentValue) {
            //J is position of the number in array not the insert element.
            inputArray[j+1] = inputArray[j];
            //to keep moving towards the beginning of the array, we need to decrement j by one.
            j--; //same as saying j = j-1


        }
        // to insert the value into its correct spot. Set the value at inputArray[] at position[j+1] and set that = to current value;
        //so it will take the value we positioned and set it to the value we saved off as a temporary variable.
        inputArray[j + 1] = currentValue;

        }

    }
}