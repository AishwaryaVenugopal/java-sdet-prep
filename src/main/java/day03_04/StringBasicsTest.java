package day03_04;

public class StringBasicsTest {

    //1. Reverse a String
    public String reverseString (String inputString) {
        String reversedString = "";
        System.out.println("Original String: " +inputString);
        for (int i = inputString.length()-1; i >=0 ; i--) {
            reversedString = reversedString + inputString.charAt(i);
        }
        System.out.println("Reversed String: " +reversedString);
        return reversedString;
    }
    //2. Check if String contains "test"
    public void containsSubstring (String inputString, String subString) {
        System.out.println("Original String: " +inputString);
        System.out.println("Sub String: " +subString);
        System.out.println((inputString.contains(subString))); //return condition ? true : false;
    }

    public static void main(String[] args) {
        String input = "HelloWorld";
        String subString = "World";
        StringBasicsTest sbt = new StringBasicsTest();
        sbt.reverseString(input);
        sbt.containsSubstring(input, subString);
    }
}
