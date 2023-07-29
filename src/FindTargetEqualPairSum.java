import java.util.HashSet;

public class FindTargetEqualPairSum {

    public static void main(String args[]){
        int arr[] = {3,4,6,9,10};
        int target = 10;
        HashSet<Integer> hset=new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            hset.add(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(hset.contains(target-arr[i])){
                System.out.println(arr[i]+" "+(target-arr[i]));
            }
        }
    }

}
