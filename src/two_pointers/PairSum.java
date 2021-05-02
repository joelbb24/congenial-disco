package two_pointers;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int target = 6;
        int[] ans = solution(arr, target);
        for(int i: ans)
            System.out.println(i+" ");
    }

    private static int[] solution(int[] arr, int target) {
        int startPointer = 0;
        int endPointer = arr.length-1;


        while(startPointer < endPointer) {
            int curr = arr[startPointer] + arr[endPointer];
            if(curr == target)
                return new int[] {startPointer, endPointer};

            if(curr < target)
                startPointer++;
            else
                endPointer--;
        }


        return new int[] {};
    }
}
