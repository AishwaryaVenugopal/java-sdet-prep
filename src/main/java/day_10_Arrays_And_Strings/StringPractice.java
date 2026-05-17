package day_10_Arrays_And_Strings;

public class StringPractice {
    //Task 1: Palindrome String
    boolean isPalindrome(String s) { //madam
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i >= 0 ; i--) {
            sb.append(arr[i]);
        }
        return s.equalsIgnoreCase(sb.toString());
    }

    boolean isPalindromeUsingTwoPointers (String s) {
        char[] arr = s.toLowerCase().toCharArray();
            int left = 0;
            int right = arr.length-1;
            while (left<right) {
                if (arr[left]==arr[right]) {
                    left++;
                    right--;
                }
                else {
                    return false;
                }
            }
            return true;
    }
    //Task 2: Linear Search arr = {3,7,2,9} target = 7 return true
    boolean containsElement(int[] arr, int target) {
        for (int i: arr) {
            if(i==target) {
                return true;
            }
        }
        return false;
    }

    //Task 3: Count frequency of characters in: "banana"
    void countCharFrequency (String s) {
        char[] arr = s.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " +count);
        }
    }

    public static void main(String[] args) {
        StringPractice test = new StringPractice();
//        System.out.println("Is Palindrome? " +test.isPalindromeUsingTwoPointers("Racecar"));
//        System.out.println("Contains target? " +test.containsElement(new int[] {3,7,2,9}, 8));
          test.countCharFrequency("banana");
    }
}
