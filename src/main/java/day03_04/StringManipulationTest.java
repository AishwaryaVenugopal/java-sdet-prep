package day03_04;

import java.util.Arrays;

public class StringManipulationTest {
    //Task 1: Remove spaces
    public void removeSpaces (String inputString) {
        System.out.println(inputString.trim());
    }

    //Task 2: Replace word
    public void replaceWord (String inputString, String oldChar, String newChar) {
        System.out.println(inputString.replace(oldChar, newChar));
    }

    //Task 3: Split string "login-success-200" based on '-'
    public void splitString (String inputString, String splitChar) {
        String[] s = inputString.split("-");
        for (String i: s) {
            System.out.println(i);
        }
    }

    //Check if a string is a palindrome
    public boolean isPalindrome (String inputString) {
        String reversedString = "";
        for (int i = inputString.length()-1; i >=0 ; i--) {
            reversedString = reversedString + inputString.charAt(i);
        }
        return inputString.equals(reversedString);
    }

    public boolean isPalindromeUsingStringBuilder (String inputString) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = inputString.length()-1; i >=0 ; i--) {
            reversedString.append(inputString.charAt(i));
        }
        return inputString.equals(reversedString.toString());
    }

    //Check if two strings are anagrams 1.listen & silent → true 2.hello & world → false
    public boolean isAnagram (String a, String b) {
        if(!(a.length() == b.length())) {
            return false;
        }
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sorted_a = new String(arr1);
        String sorted_b = new String(arr2);
        return sorted_a.equals(sorted_b);
    }

    public boolean isAnagramUpgraded (String a, String b) {
        if(!(a.length() == b.length())) {
            return false;
        }
        char[] arr1 = a.toLowerCase().trim().toCharArray();
        char[] arr2 = b.toLowerCase().trim().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sorted_a = new String(arr1);
        String sorted_b = new String(arr2);
        return sorted_a.equals(sorted_b);
    }

    public static void main (String[] args) {
        StringManipulationTest smt = new StringManipulationTest();
        /*smt.removeSpaces("  Test Automation  ");
        smt.replaceWord("Test Automation", "Test", "API");
        smt.splitString("login-success-200", "-");*/
//        System.out.println("Given String is a palindrome: " +smt.isPalindromeUsingStringBuilder("madam"));
        System.out.println("Given String is a Anagram: " +smt.isAnagramUpgraded("Listen", "Silent"));
//        System.out.println("Given String is a Anagram: " +smt.isAnagramUpgraded("hello", "world"));
    }
}
