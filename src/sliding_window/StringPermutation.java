package sliding_window;

import java.util.Arrays;

public class StringPermutation {
    public static void main(String[] args) {
        String input = "oidbcaf";
        String pattern = "abc";
        System.out.println(findPermutation(input, pattern));
    }

    private static boolean findPermutation(String input, String pattern) {
        int windowSize = pattern.length();
        int windowStart = 0;
        char[] charpat = pattern.toCharArray();
        Arrays.sort(charpat);
        for(int windowEnd = windowSize-1; windowEnd < input.length(); windowEnd++) {
            String temp = input.substring(windowStart, windowEnd);
            char[] charsinp = temp.toCharArray();
            Arrays.sort(charsinp);
            if(charsinp.equals(charpat)) {
                return true;
            }
            windowStart++;
        }

        return false;
    }
}
