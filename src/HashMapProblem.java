
/*
      Find K most occurring elements in the given array. (If two numbers have the same frequency
      then the number with a larger value should be given preference)
      Input: array [] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9}, K = 4

      Output: 5 11 7 10
*/

import java.util.*;
import static java.util.stream.Collectors.toMap;

public class HashMapProblem {
    public static void main(String[] args) {

        int Array [] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int K = 4;

        HashMap<Integer, Integer> hmap=new HashMap<>();
        for(int i=0;i<Array.length;i++){
            if(hmap.containsKey(Array[i])){
                hmap.put(Array[i],hmap.get(Array[i])+1);
            } else hmap.put(Array[i],1);
        }

        Map<Integer, Integer> sorted = hmap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()).reversed()).limit(K)
                .collect(toMap(e->e.getKey(), e->e.getValue(),(e1,e2)->e1, LinkedHashMap::new));

        System.out.println(sorted.keySet());

    }
}
