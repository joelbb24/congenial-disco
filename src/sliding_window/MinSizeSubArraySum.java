package sliding_window;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,1,5,2,3,2};
        int S = 7;
        System.out.println(findMinSizeSubArray(S, arr));
    }

    public static int findMinSizeSubArray(int S, int[] arr)
    {
        int minWindow = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum = windowSum + arr[windowEnd];
            while(windowSum >= S){
                minWindow = Math.min(minWindow, windowEnd - windowStart + 1);
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }

        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
}
