
/*
    Find the second largest element of the given array?
    int [] numbers = {14, 46, 47, 86, 92, 52, 48, 36, 66, 85};
    Note: Don't use any collections concepts & use a single “for” loop.

*/
public class SecondLargestElementProblem {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] numbers = {14, 46, 47, 86, 92, 92, 52, 48, 88, 36, 66, 85};

        int highest = Integer.MIN_VALUE;
        int secondHighest= Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>highest){
                secondHighest = highest;
                highest = numbers[i];
            } else if(numbers[i] < highest && numbers[i] > secondHighest){
                secondHighest = numbers[i];
            }
        }

        System.out.println(secondHighest);


    }
}
