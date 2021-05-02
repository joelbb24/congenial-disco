package sliding_window;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LongestSubstringKDistinct {
    public static void main(String[] args) {
        String s  = "araaci";
        int K = 2;
        System.out.println(findLength(s,K));
    }

    private static int findLength(String s, int k) {
        if(s.length() == 0 || s.length()<k) {
            throw new IllegalArgumentException();
        }

        Map<Character, Integer> map = new HashMap<>();
        int windowStart = 0;
        int maxLength = 0;
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char right = s.charAt(windowEnd);
            map.put(right, map.getOrDefault(right, 0)+1);
            while(map.size() > k) {
                char left = s.charAt(windowStart);
                map.put(left, map.get(left)-1);
                if(map.get(left) == 0) {
                    map.remove(left);
                }
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
