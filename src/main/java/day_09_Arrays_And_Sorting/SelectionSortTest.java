package day_09_Arrays_And_Sorting;

import java.util.Arrays;

public class SelectionSortTest {
    void selectionSort(int[] arr) {//3,1,2,5,4
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Selection sort completed: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        SelectionSortTest test = new SelectionSortTest();
        test.selectionSort(new int[] {3,1,2,5,4});
        test.selectionSort(new int[] {1,2,3,3,9,1,5});
    }
}
