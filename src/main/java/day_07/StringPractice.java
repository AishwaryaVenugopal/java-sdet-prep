package day_07;

public class StringPractice {

    //Task 1: Count number of words in a sentence "I love Java programming"
    int countWords(String s) {
        String[] words = s.split(" ");
        return words.length;
    }

    int countWordsOptimized (String s) {
        String[] words = s.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        StringPractice test = new StringPractice();
        System.out.println(test.countWordsOptimized(" I love  Java programming "));
    }
}
