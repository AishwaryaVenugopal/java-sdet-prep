package day_11_HashingPractice;

import java.util.HashMap;
import java.util.HashSet;

public class codeWithHashing {
    //Task 1: Count frequency of characters in: "banana"
    void countFrequencyUsingHashMap(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c: arr) {
            if(map.containsKey(c)) {
                map.put(c,map.get(c) +1);
            }
            else {
                map.put(c,1);
            }
        }
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    //Task 2: check if string contains duplicates {1,2,3,4,2}
    boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr) {
            if(set.contains(i)) {
                return true;
            }
            else {
                set.add(i);
            }
        }
        return false;
    }

    //Task 3: check if given strings are anagrams
    boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        if(arr1.length!=arr2.length) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(Character c : arr1) {
            if(map1.containsKey(c)) {
                map1.put(c, map1.get(c)+1);
            }
            else {
                map1.put(c,1);
            }
        }
        for(Character c : arr2) {
            if(map2.containsKey(c)) {
                map2.put(c, map2.get(c)+1);
            }
            else {
                map2.put(c,1);
            }
        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        codeWithHashing test = new codeWithHashing();
//        test.countFrequencyUsingHashMap("Banana");
//        System.out.println("Contains duplicates? " +test.containsDuplicate(new int[] {1,2,3,4,2}));
        System.out.println("Is Anagram? " +test.isAnagram("listen", "silent"));
    }
}
