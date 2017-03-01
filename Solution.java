package leetcode_13_roman_to_int;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        int result = 0;
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        for(int i = 0; i < s.length() - 1; i++) {
            char tmpChar = s.charAt(i);
            int add = map.get(tmpChar);
            
            switch(tmpChar) {
                case 'I':
                    add = (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') ? -add : +add;
                    result = result + add;
                    break;
                case 'V':
                    result = result + add;
                    break;
                case 'X':
                    add = (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') ? -add : +add;
                    result = result + add;
                    break;
                case 'L':
                    result = result + add;
                    break;
                case 'C':
                    add = (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') ? -add : +add;
                    result = result + add;
                    break;
                case 'D':
                    result = result + add;
                    break;
                case 'M':
                    result = result + add;
                    break;
                default:
                    break;
            }
        }
        
        return result + map.get(s.charAt(s.length() - 1));
        
    }
}