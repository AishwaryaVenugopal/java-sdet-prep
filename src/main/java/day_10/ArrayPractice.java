package day_10;

import java.util.Arrays;

public class ArrayPractice {
    //Task 1: Find the largest element in the array {9, 9, 7}
    int largestElement (int[] arr) {
        int largestElement = arr[0];
        for (int i=1; i<arr.length; i++) {
            if(arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }

    //Task 2: Find the second largest element in array.
    int secondLargest (int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if((arr[i]<largest) && (arr[i]>secondLargest)) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    //Task 3: Move all zeros to the END of the array {0, 1, 0, 3, 12}
    void moveZerosToEnd (int[] arr) {
        int nonZeroIndex = 0;
        for (int i=0; i<arr.length; i++) { //4
            if(arr[i]!=0) {
                int temp = arr[i]; //12
                arr[i] = arr[nonZeroIndex]; // 0 0 0 3 12 -> 1 0 0 0 12 ->  1 3 0 0 0
                arr[nonZeroIndex] = temp; // 1 0 0 3 12 -> 1 3 0 0 12 -> 1 3 12 0 0
                nonZeroIndex++; //3
            }
        }
        System.out.println("Moving Zeros to end: " + Arrays.toString(arr));
    }

    public static void main (String[] args) {
        ArrayPractice test = new ArrayPractice();
        System.out.println("The largest element is: " +test.largestElement(new int[] {7, 6, 6}));
        System.out.println("The second largest element is: " +test.secondLargest(new int[] {7, 6, 6}));
        test.moveZerosToEnd(new int[] {0, 1, 0, 3, 12});
    }
}
