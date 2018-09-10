package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    static int getMissingNum (int array[], int x)
    {
        int i, sum;
        sum  = (x+1)*(x+2)/2;
        for ( i = 0; i< x; i++)
            sum -= array[i];
        return sum;
    }

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 7, 5, 3, 8, 9, 6};
        int missNum = getMissingNum(array, 9);
        System.out.println(missNum);
    }
}
