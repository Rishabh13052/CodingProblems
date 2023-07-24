import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CountWordFrequency {
    public static void main(String[] args) {

        //initialize the sentence
        String str="Hi this is sample task hi this sample is hi";

        //split the string into string array using space as delimiter
        String splitStr[]=str.split(" ");

        List<String> stringList=new ArrayList<>();

        //store string array into list
        for(String s: splitStr){
            stringList.add(s);
        }

        //using Java8, calculate string and its frequency
        Map<String, Long> stringFreq= stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //print the map elements
        stringFreq.entrySet().stream().forEach(System.out::println);


        //without using Java8, use hashmap.
        HashMap<String, Integer> hmap=new HashMap<>();

        for(String stringMap: splitStr){
            if(hmap.containsKey(stringMap)){
                hmap.put(stringMap,hmap.get(stringMap)+1);
            } else hmap.put(stringMap,1);
        }

        hmap.entrySet().stream().forEach(System.out::println);
    }
}