package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String[] wrds = st.split(" "); //spliting the whole string.


        //adding and checking if the word is already in map
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < wrds.length; i++){
            String wrd = wrds[i].toLowerCase();

            if (map.get(wrd) == null){
                map.put(wrd, count);
            }else {
                System.out.println("The Repeated word is: " + wrd);
                map.replace(wrd, map.get(wrd) +1);
                System.out.println("Repeated word's number of occurrence is: " +map.get(wrd));
            }
        }


        int total = 0;
        int counter = 0;
        for (String str : map.keySet()){
            if(map.get(str)>0){
                total += str.length();
                counter++;
            }
        }

        System.out.println("Average length of the words is: " + total/counter);
    }

}
