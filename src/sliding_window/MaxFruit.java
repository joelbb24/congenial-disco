package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MaxFruit {
    public static void main(String[] args) {
        char[] fruits = {'A','B','C','A','C'};
        System.out.println(getMaxFruit(fruits));
    }

    private static int getMaxFruit(char[] fruits) {
        int maxFruits = 0;
        int windowStart = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int windowEnd = 0; windowEnd < fruits.length; windowEnd++) {
            char right = fruits[windowEnd];
            map.put(right, map.getOrDefault(right, 0)+1);
            while(map.size() > 2) {
                char left = fruits[windowStart];
                map.put(left, map.get(left)-1);
                if(map.get(left) == 0) {
                    map.remove(left);
                }
                windowStart = windowStart + 1;
            }
            maxFruits = Math.max(maxFruits, windowEnd - windowStart + 1);
        }

        return maxFruits;
    }
}
