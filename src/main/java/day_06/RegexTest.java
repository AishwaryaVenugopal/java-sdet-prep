package day_06;

public class RegexTest {
    //Task 1: Check if string contains only alphabets
    public boolean containsOnlyAlphabets (String inputString) {
        return (inputString.matches("[a-zA-Z]+"));
    }

    //Task 2: Remove Special Characters
    public String removeSpecialChars (String inputString) {
        return inputString.replaceAll("[^a-zA-Z0-9]+", "");
    }

    //Task 3: Reverse Words in Sentence
    public String reverseWords(String s) {
        StringBuilder reversedString = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            reversedString.append(arr[i]);
            if(i!=0) {
                reversedString.append(" ");
            }
        }
        return reversedString.toString();
    }

    //Task 4: first non-repeating character aabbcde  aabbcc
    public char firstNonRepeatingChar(String s) {
        char[] arr = s.toCharArray();
//        int count = 0;
        char firstNonRepeatingChar = '\0'; //null char
        for (int i = 0; i < s.length(); i++) {
           int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if(arr[i]==arr[j]) {
                    count = count +1;
                }
            }
            if (count == 1) {
                firstNonRepeatingChar = arr[i];
                break;
            }
//            count = 0;
        }
        return firstNonRepeatingChar;
    }

    public static void main(String[] args) {
        RegexTest test = new RegexTest();
//        System.out.println("First Non Repeating Char: " +test.firstNonRepeatingChar("aabb"));
//        System.out.println("Reversed Sentence: " +test.reverseWords("I love Java"));
        /*System.out.println("Contains only alphabets: " +test.containsOnlyAlphabets("hello"));
        System.out.println("Contains only alphabets: " +test.containsOnlyAlphabets("HelloWorld"));
        System.out.println("Contains only alphabets: " +test.containsOnlyAlphabets("hello123"));
        System.out.println("Contains only alphabets: " +test.containsOnlyAlphabets("abc@"));*/
        System.out.println("Replace All special chars in " +"abc@123#" +" " +test.removeSpecialChars("abc@123#"));
    }
}
