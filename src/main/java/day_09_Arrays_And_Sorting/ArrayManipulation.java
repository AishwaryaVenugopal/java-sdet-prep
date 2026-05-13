package day_09_Arrays_And_Sorting;

import java.util.Arrays;

public class ArrayManipulation {
    //Task 1: Reverse Array (In-Place) Input: {1,2,3,4,5} output: {5,4,3,2,1}
    void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left < right) {// 0<4 -> 1<3 ->2<2 break
                int temp = arr[left]; //1 //2
                arr[left] = arr[right]; //5 //4
                arr[right] = temp; //1 //2
                left++; //2
                right--; //2
            }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        ArrayManipulation test = new ArrayManipulation();
        test.reverseArray(new int[] {1,2,3,4,5,6});
        test.reverseArray(new int[] {1});
    }
}
