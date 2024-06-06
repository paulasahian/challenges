/**
 * @since 0.0.1
 * @author paulaSahian
 * @version 0.0.1
 *
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one 
 * candle for each year of their total age. 
 * They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
 * 
 * Example:
 * candlews = [4, 4, 1, 3]
 * The maximum height candles are  units high. There are  of them, so return .
 * 
 * Function Description:
 * Complete the function birthdayCakeCandles in the editor below.
 * birthdayCakeCandles has the following parameter(s):
 * int candles[n]: the candle heights
 * 
 * Returns:
 * int: the number of candles that are tallest
 * 
 * Input Format:
 * The first line contains a single integer, , the size of .
 * The second line contains  space-separated integers, where each integer  describes the height of .
 * 
 * Sample Input 0
 * 4
 * 3 2 1 3
 * Sample Output 0
 * 2
 * Explanation 0
 * Candle heights are . The tallest candles are  units, and there are  of them.
 */

import java.util.Arrays;
import java.util.List;

/**
 * Main Class for the ContainerWithMostWater
 */
public class BirthdayCakeCandlesClass {

    public static void main(final String[] args) {
        // List<Integer> candles = Arrays.asList(4, 4, 1, 3);               // Output: 2
        List<Integer> candles = Arrays.asList(4, 4, 5, 1, 3, 5);       // Output: 2

		int tallestCandles = birthdayCakeCandles(candles);

		System.out.println(tallestCandles);
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max= candles.get(0);
        int counter = 0;
        for (int i = 0; i< candles.size(); i++) {
            //System.out.println(candles.size());
            int current = candles.get(i);
            if (current > max){
                max= current;
                counter=1;
            } else if (current == max) {
                counter ++;
            }
        }
        return counter;
    }
    
}
