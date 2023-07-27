    /*

    Problem Statement

If you take any four digits number (let's say 3281) and arrange its digits in descending order (8321) and ascending order (1238) and then subtract the smaller number from the larger number --
and if you repeat that process, you will reach number 6174. For example: 3281: 8321 - 1238 = 7083; 8730 - 0378 = 8352; 8532 - 2358 = 6174 Number 6174 - when you do this process, will result into 6174 itself.
Exception to this is a four digits number with all same digits (such as 1111, 2222, 3333 etc.), as that will result into 0 in the very first step.
Your task is to write a function that finds out that for all four digits numbers (from 1000 to 9999), how many steps does it take to reach the magic number (6174).
The function should also find out if it can't reach the number 6174 for whatever reason.

    */

public class MagicNumberProblem {
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        MagicNumberProblem m=new MagicNumberProblem();
        for(int i=1000;i<=9999;i++){
            //int n=3281;
            int steps=0;
            boolean result=m.checkMagicNumber(i,steps);
            if(result){
                System.out.println(i);
            }
        }
    }

    public boolean checkMagicNumber(int n, int steps){
        if(n!=0){
            int asc=getAscendingOrder(n);
            int desc=getDescendingOrder(n);
            System.out.println(asc+" "+desc);

            if((asc-desc)==6174){
                return true;
            } else if (asc==desc) {
                return false;
            }
            //int temp=asc-desc;
            steps++;
            return checkMagicNumber(asc-desc,steps);
        }
        return false;
    }
    public int getAscendingOrder(int n){
        //int number = 52146729;
        int sortedNumber = 0;
        for (int i = 9; i >= 0; i--)
        {
            int tmpNumber = n;
            while (tmpNumber > 0)
            {
                int digit = tmpNumber % 10;
                if (digit == i)
                {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                tmpNumber /= 10;
            }
        }
        //System.out.println(sortedNumber);
        return sortedNumber;
    }

    public int getDescendingOrder(int n){
        //int number = 52146729;
        int sortedNumber = 0;
        for (int i = 0; i <= 9; i++)
        {
            int tmpNumber = n;
            while (tmpNumber > 0)
            {
                int digit = tmpNumber % 10;
                if (digit == i)
                {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                tmpNumber /= 10;
            }
        }
        //System.out.println(sortedNumber);
        return sortedNumber;
    }
}


