package day_09_Arrays_And_Sorting;

import java.util.Arrays;

public class BubbleSortTest {
    void bubbleSort(int[] arr) { //1,3,2,5,4
        for (int i = 0; i < arr.length; i++) { //i=0
            for (int j = 0; j < arr.length-1-i; j++) { //j=0,1,2,3
                if(arr[j]>arr[j+1]) { // 1>3 false, 3>2, 3>5 false, 5>4
                    int temp = arr[j]; //3 //5
                    arr[j] = arr[j+1]; //2 //4
                    arr[j+1] = temp; //3 -> {1,2,3,5,4}, //4 -> {1,2,3,4,5}
                }
            }
        }
        System.out.println("Bubble Sorted: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        BubbleSortTest test = new BubbleSortTest();
        test.bubbleSort(new int[] {1,2,3,3,9,1,5});
    }
}
