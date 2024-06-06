/**
 * @since 0.0.1
 * @author paulaSahian
 * @version 0.0.1
 * Plus Minus
 * 
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with  places after the decimal.
 * 
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
 * though answers with absolute error of up to  are acceptable.
 * 
 * Example:
 * There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
 * 0.400000
 * 0.400000
 * 0.200000
 * 
 * Function Description:
 * Complete the plusMinus function in the editor below.
 * plusMinus has the following parameter(s):
 * int arr[n]: an array of integers
 * 
 * Print:
 * Print the ratios of positive, negative and zero values in the array.
 * Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.
 * 
 * Input Format:
 * The first line contains an integer, , the size of the array.
 * The second line contains  space-separated integers that describe .
 * 
 */

import java.util.Arrays;
import java.util.List;

/**
 * Main Class for the PlusMinusClass
 */
public class PlusMinusClass {

    public static void main(final String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 0, -1, -1);             // Output: .4000, .40000, .20000

		plusMinus(arr);
	}

	public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int size = arr.size();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        for(int number: arr){
            if(number >=1 ){
                positiveCount ++; 
            } else if (number< 0){
                negativeCount ++;
            } else {
                zeroCount ++;
            }
        }
        
        double positiveRatio = (double) positiveCount / (double) size;
        double negativeRatio = (double) negativeCount / (double) size;
        double zeroRatio = (double) zeroCount / (double) size;

        System.out.println(String.format("%.6f", positiveRatio));
        System.out.println(String.format("%.6f", negativeRatio));
        System.out.println(String.format("%.6f", zeroRatio));
    }
    
}
