package day_08;

import java.util.Arrays;

public class ArrayBasics {
    //Task 1: Find the largest element in the array
    int largestElement(int[] arr) {
        int largestElement = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(largestElement < arr[i]) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }

    //Task 2: Find the second largest element in array.
    int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            } else if ((num < largest) && (num > secondLargest)) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    //Task 3: Move all zeros to the END of the array {0, 1, 0, 3, 12}
    void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;
        for(int i =0; i<arr.length; i++) {
            if(arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        ArrayBasics test = new ArrayBasics();
        /*System.out.println("Largest Element is: " +test.largestElement(new int[] {9, 9, 7}));
        System.out.println("Second Largest Element is: " +test.secondLargest(new int[] {9, 9, 7}));*/
        test.moveZerosToEnd(new int[] {0, 1, 0, 3, 0});
    }
}
