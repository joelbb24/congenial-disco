package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {
    public static void main(String[] args) {
        String input = "aabccbb";
        System.out.println(findMaxNoRepeatSubstring(input));
    }

    private static int findMaxNoRepeatSubstring(String input) {
        int maxLength = 0;
        int windowStart = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int windowEnd = 0; windowEnd < input.length(); windowEnd++) {
            char right = input.charAt(windowEnd);
            if(map.containsKey(right)) {
                windowStart = Math.max(windowStart, map.get(right)+1);
            }
            map.put(right, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
