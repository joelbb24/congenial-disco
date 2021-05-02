package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class ReplacingOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,0,1,1,0,1,1};
        int k = 2;
        System.out.println(findLength(arr, k));
    }

    private static int findLength(int[] arr, int k) {
        int maxLength = 0;
        int windowStart = 0;
        int maxOnesCount = 0;
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            if(arr[windowEnd] == 1) {
                maxOnesCount++;
            }

            if(windowEnd - windowStart + 1 - maxOnesCount > k) {
                if(arr[windowStart] == 1) {
                    maxOnesCount--;
                }
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
