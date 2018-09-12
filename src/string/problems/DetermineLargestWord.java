package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        System.out.println(largestWord(s));

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String[] split = wordGiven.split(" ");

        for(int i=0;i<split.length;i++){
            map.put(split[i].length(),split[i]);
        }

        return map;
    }

    public static String largestWord(String wordGiven){
        DetermineLargestWord detLarge =new DetermineLargestWord();
        Map<Integer, String> wordNLength = detLarge.findTheLargestWord(wordGiven);
        int largest = 0;
        String lrgVal = "";
        for(Map.Entry<Integer, String> ckLen : wordNLength.entrySet()){
            if(largest< ckLen.getKey()) {
                largest = ckLen.getKey();
                lrgVal = ckLen.getValue();
            }
        }
        return lrgVal;
    }
}
