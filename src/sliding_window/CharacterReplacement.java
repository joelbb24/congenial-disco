package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {
    public static void main(String[] args) {
        String input = "aabccbb";
        int k = 2;
        System.out.println(findMaxCharacterReplacement(input, k));
    }

    private static int findMaxCharacterReplacement(String input, int k) {
        int maxCharacterReplacements = 0;
        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int windowEnd = 0; windowEnd < input.length(); windowEnd++) {
            char right = input.charAt(windowEnd);
            map.put(right, map.getOrDefault(right, 0)+1);
            maxCharacterReplacements = Math.max(maxCharacterReplacements, map.get(right));
            if(windowEnd - windowStart + 1 - maxCharacterReplacements > k) {
                char left = input.charAt(windowStart);
                map.put(left, map.get(left)-1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
