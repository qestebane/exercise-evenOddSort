import java.io.IOException;
import java.util.*;

public class Solution {


    public static void main(String[] args) throws IOException {

        //input amount of random integers
        int[] ans = Solution.evenOddSort(randomNumbers(5));

        System.out.println(Arrays.toString(ans));

    }

    /**
     * sort array even and odd numbers
     * @param array
     * @return
     */
    public static int[] evenOddSort(int[] array) {
        int nextEven = 0;
        int nextOdd = array.length - 1;
        while (nextEven < nextOdd) {
            if (array[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = array[nextEven];
                array[nextEven] = array[nextOdd];
                array[nextOdd] = temp;
                nextOdd--;
            }
        }
        return array;
    }

    /**
     * Generate number of random
     * @param nums
     * @return
     */
    public static int[] randomNumbers(int nums){
        int[] num = new int[nums];
        int i=0;
        Random random = new Random();

        while (i<nums){
            //random between 1 and 10
            int randomInt = random.nextInt(10) + 1;
            num[i]=randomInt;
            i++;
        }
        return  num;
    }
}
