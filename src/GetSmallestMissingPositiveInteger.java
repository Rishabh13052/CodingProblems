import java.util.Arrays;

/*
    Given an unsorted integer array number, return the smallest missing positive integer.
*/
public class GetSmallestMissingPositiveInteger {

    public static void main(String args[]){
        int [] unsortedArray = {-14, 46, -47, 0, -86, 92, 52, 4, 1, 2, 48, 36, 66, 85};
        Arrays.sort(unsortedArray);
        int target=1;

        for(int i=0;i<unsortedArray.length;i++){
            if(unsortedArray[i]==target){
                target++;
            }
        }

        System.out.println(target);
    }


}
