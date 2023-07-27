import java.util.HashMap;

/*
Find a frequency of words in a string, without using split or tokenizer?
        String inputString = "Core java test and core java interview".
        OUTPUT:
        Total words - 7
        Core -2
        java-2 test-1
        and -1 interview-1
*/
public class FrequencyOfWordProblem {
    public static void main(String args[]){
        String inputString = "Core java test and core java interview";
        char ch[]=inputString.toCharArray();

        int countSpaces=0;

        for(int i=0;i<ch.length;i++){
            if(ch[i]== ' ') countSpaces++;
        }

        System.out.println(countSpaces);

        String tokensArray[] = new String[countSpaces +1];
        int k=0;
        for(int i=0;i < tokensArray.length; i++){
            tokensArray[i]="";
        }
        for(int i=0;i < ch.length; i++){
            if(ch[i]!=' '){
                tokensArray[k] = tokensArray[k] + ch[i];
            } else {
                k++;
            }
        }

        for(int i=0;i < tokensArray.length; i++){
            System.out.println(tokensArray[i]);
        }

        HashMap<String, Integer> hmap = new HashMap<>();

        for(int i=0; i< tokensArray.length ;i++){
            if(hmap.containsKey(tokensArray[i])){
                hmap.put(tokensArray[i], hmap.get(tokensArray[i])+1);
            } else hmap.put(tokensArray[i],1);
        }
        System.out.println("Total Words "+tokensArray.length);
        hmap.entrySet().stream().forEach(System.out::println);

    }
}
