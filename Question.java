package leetcode_13_roman_to_int;

/*
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */

public class Question {
	public static void main(String args[]) {
		String romanStr = "MCMXCVI";
		int result = 0;
		
		result = Solution.romanToInt(romanStr);
		
		System.out.print(" final_result: " + result);
		
	}
}
